import http from 'k6/http';
import { check, group, sleep } from 'k6';
import { Trend } from 'k6/metrics';

export const options = {
  vus: 5,
  duration: '30s',
};

const responseTimeTrend = new Trend('response_time');

export default function () {
  group('█ Amazon Home Page Test', () => {
    const res = http.get('https://www.amazon.in/');

    check(res, {
      'Status is 200': (r) => r.status === 200,
      'Body is not empty': (r) => r.body && r.body.length > 0,
      'Response time < 200ms': (r) => r.timings.duration < 200,
    });

    responseTimeTrend.add(res.timings.duration);

    sleep(1);
  });
}
