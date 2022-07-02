## 문제 설명
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

## 제한 사항
- numbers의 길이는 1 이상 100,000 이하입니다.
- numbers의 원소는 0 이상 1,000 이하입니다.
- 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.

## 입출력 예

| numbers           | return     |
|-------------------|------------|
| [6, 10, 2]        | 	"6210"    |
| [3, 30, 34, 5, 9] | 	"9534330" |

## 풀이

스트림을 잘 활용하자.

- IntStream.of
- mapToObj
- String::valueOf
- sorted
- () -> compareTo
- Collectors.joining()


`.sorted((a, b) -> (b + a).compareTo(a + b)) ` 
- 여기서의 .compareTo 는 String.compareTo이다.
- (b+a).compareTo(a+b)는 내림차순을 의미한다.
  - why: sort를 재정의. 원래는 오름차순이었다면, 내림차순으로 재정의 한 것.

```
Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });
```

`IntStream.of(numbers)`

- 기본타입 스트림 생성

`mapToObj(String::valueOf)`

- 스트림은 Obj타입 스트림으로 변환.
- toString이랑 비슷. 근데 NPE가 안일어남.

[참고](https://st-lab.tistory.com/243?category=830901)

