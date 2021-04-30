# Project_SBPG
* Seed-Based Procedural Generations

> 시드값을 기준으로 절차적 생성 알고리즘을 연구하는 프로젝트입니다.  
---

## 0. 왜 시드베이스 절차적 생성 인가?

### 0.1. 절차적 생성

<table width="100%" text-align="center" border="0">
    <tr>
        <th>
            디아블로3
        </th>
        <th>
            문명 5
        </th>
    </tr>
    <tr>
        <td width="50%">
            <img src="./readmeimg/01diablo.jpg">
        </td>
        <td width="50%">
            <img src="./readmeimg/01civ.jpg">
        </td>
    </tr>
    <tr>
        <th>
            ▲ 디아블로3
        </th>
        <th>
            ▲ 문명 5
        </th>
    </tr>
</table>

위 게임들은 방대한 양의 컨텐츠로 오랜 시간 유저를 묶는다는 점 때문에 소위 악마의 게임이라고 불러진다.

유저들에게 지속적이면서도 새로운 경험을 하게 도와주는 비결은 `절차적 생성`에 있다고 한다.

`절차적 생성`을 이용하여 적은 리소스로 많은 양의 컨텐츠를 생성 할 수 있다.

* 디아블로
 
 디아블로의 경우 균열 시스템을 예로 들 수 있는데
 
 스토리 진행 중 볼수있는 맵 리소스를 재활용 하여 `절차적 생성`과정을 거쳐 새로운 맵을 생성한다.
 
 자칫 지루할 수 있는 템파밍 과정에 지속적으로 새로운 경험을 선사하는데 큰 도움이 되었을것이다.
 
* 문명 5
 
 문명5의 맵은 `절차적 생성`을 거쳐 무작위맵이 생성된다.

### 0.2. 그럼 왜 시드베이스인가

시드 베이스 절차적 생성을 하는 게임 


![pepeb](./readmeimg/pepeb.jpg)

지금부터 함께 절차적생성에 사용되는 알고리즘들을 알아보자.

## 1. 셀룰러 오토마타 알고리즘

셀룰러 오토마타 알고리즘을 이용하면 자연스러운 동굴의 형태를 만들 수 있다.

무작위로 0 과 1을 배치 한 후, 셀룰러 오토마타 4-5룰을 4회정도 적용하면 자연스러운 동굴의 형태를 만들 수 있다.

![10](./readmeimg/10genjava.jpg)
