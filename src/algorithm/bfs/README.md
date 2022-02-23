# Breadth First Search

이곳은 BFS에 관한 문제를 모아놓은 문서입니다.

## 개념

BFS: 다차원 배열에서 각 칸을 방문할 때 너비를 우선으로 방문하는 알고리즘

- BFS는 그래프라는 자료구조에서 모든 노드를 방문하기 위한 알고리즘
- 시작하는 칸을 큐에 넣고 방문했다는 표시를 남긴다.
- 큐가 빌 때까지 원소를 꺼내고, 상하좌우로 인접한 칸에 대해 처음으로 방문했다면 해당 칸을 큐에 삽입
- 시간복잡도: 모든 칸에 방문 표시를 남기기에, 칸이
- N개일 때 O(n)이다. 행이 R, 열이 C개일 경우 O(rc).

Pair 클래스: 두 자료형을 묶어서 편리하게 사용

Pair.java
```
class Pair {
    private int x;
    private int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
```

Main.java

```
Queue<Pair> queue = new LinkedList<>();\
        
queue.add(new Pair(0,0));
```



## 문제

- [그림](./draw) -Silver1