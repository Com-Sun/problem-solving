# 버블 정렬

## 개념

- 맨 앞에서부터 현재의 원소와 바로 다음의 원소를 비교
- 현재 원소가 다음의 원소보다 크다면 서로 교환
- 한 칸 이동해서 반복

즉, 맨 마지막에 가장 큰 수가 위치하는 식이다.
반복횟수는 루프를 한 번 돌 때마다 하나씩 줄어든다.

- 시간복잡도 : O(n^2)

## 구현

나의 경우 Bubble클래스를 만든 뒤, sort 메서드를 static으루 구현했다.

static으로 메서드를 선언하면 메모리상에서 class영역에 생성된다. 클래스 변수는 클래스가 메모리에 올라갈 때 단 한 번  할당된다.
즉, 객체 생성없이 메서드를 사용할 수 있기에 static으로 선언한 것이다.

## 문제

- [수 정렬하기](./sortingnum) - Bronze2


