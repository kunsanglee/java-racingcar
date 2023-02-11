# java-racingcar

자동차 경주 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

# 1단계 페어프로그래밍

## 기능 목록

### 자동차 이름 입력

- [x] 자동차 이름 입력
- [x] 공백 제거
- [x] ,로 자르기
- [x] 2명 이상이 아니면 예외처리
- [x] 6자 이상의 이름이 포함된 경우 예외처리

### 자동차 생성

- [x] `Car` 객체를 생성해 `CarRepository`에 저장

### 이동 횟수 입력

- [x] 공백 제거
- [x] 자연수가 아니면 예외처리
- [x] int 범위를 초과하는 경우 예외처리
- [x] 이동 횟수가 0인 경우 예외처리

### 자동차 이동

- [x] 랜덤 숫자에 따라 전진 혹은 멈춤
- [x] 자동차 위치 업데이트
- [x] 중간 결과 출력
- [x] 이동 횟수만큼 반복

### 최종 우승자 선정 및 출력

- [x] 위치 최댓값 선정
- [x] 최종 우승자 선정
- [x] 최종 우승자 출력


- [x] 에러 메세지 출력
- [x] indent는 최대 1
- [x] 메서드는 최대 15줄

---

# 2단계 리팩터링

- [ ] `carName`까지도 하나의 클래스로 만들어 `CarName` 생성자에서 이름을 검증한다.
- [ ] 모든 `Validator`를 추상화한 조상 클래스를 구현한다.
- [ ] `Car`의 `move(boolean isMove)` 메서드에 대해 고민하자... 현재 `false`가 들어오면 함수를 호출하는 의미가 없다
- [x] 사용자가 입력한 이름이 `null`인 경우에 어떻게 할 지! `name.isBlank()`같은 메서드를 사용해 추가적인 예외 처리가 필요해 보임
- [x] `MainController`에서 발생할 수 있는 다른 예외에 대한 처리
- [x] `CarRepository`를 인스턴스화하자