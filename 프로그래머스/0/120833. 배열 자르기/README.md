# [level 0] 배열 자르기 - 120833 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120833) 

### 성능 요약

메모리: 9.03 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 09월 11일 23:48:01

### 문제 설명

<p style="user-select: auto !important;">정수 배열 <code style="user-select: auto !important;">numbers</code>와 정수 <code style="user-select: auto !important;">num1</code>, <code style="user-select: auto !important;">num2</code>가 매개변수로 주어질 때, <code style="user-select: auto !important;">numbers</code>의 <code style="user-select: auto !important;">num1</code>번 째 인덱스부터 <code style="user-select: auto !important;">num2</code>번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">2 ≤ <code style="user-select: auto !important;">numbers</code>의 길이 ≤ 30</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">numbers</code>의 원소 ≤ 1,000</li>
<li style="user-select: auto !important;">0 ≤<code style="user-select: auto !important;">num1</code> &lt; <code style="user-select: auto !important;">num2</code> &lt; <code style="user-select: auto !important;">numbers</code>의 길이</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">numbers</th>
<th style="user-select: auto !important;">num1</th>
<th style="user-select: auto !important;">num2</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1, 2, 3, 4, 5]</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">[2, 3, 4]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1, 3, 5]</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">[3, 5]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">[1, 2, 3, 4, 5]의 1번째 인덱스 2부터 3번째 인덱스 4 까지 자른 [2, 3, 4]를 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">[1, 3, 5]의 1번째 인덱스 3부터 2번째 인덱스 5까지 자른 [3, 5]를 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges