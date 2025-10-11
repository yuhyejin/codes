# [level 0] 옷가게 할인 받기 - 120818 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120818) 

### 성능 요약

메모리: 9.31 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 10월 11일 20:56:50

### 문제 설명

<p style="user-select: auto !important;">머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.<br style="user-select: auto !important;">
구매한 옷의 가격&nbsp;<code style="user-select: auto !important;">price</code>가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">10 ≤ <code style="user-select: auto !important;">price</code> ≤ 1,000,000

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">price</code>는 10원 단위로(1의 자리가 0) 주어집니다.</li>
</ul></li>
<li style="user-select: auto !important;">소수점 이하를 버린 정수를 return합니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">price</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">150,000</td>
<td style="user-select: auto !important;">142,500</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">580,000</td>
<td style="user-select: auto !important;">464,000</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">150,000원에서 5%를 할인한 142,500원을 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">580,000원에서 20%를 할인한 464,000원을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges