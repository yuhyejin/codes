# [level 0] 모음 제거 - 120849 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120849) 

### 성능 요약

메모리: 9.21 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 10월 12일 22:48:45

### 문제 설명

<p style="user-select: auto !important;">영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 <code style="user-select: auto !important;">my_string</code>이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">my_string</code>은 소문자와 공백으로 이루어져 있습니다.</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">my_string</code>의 길이 ≤ 1,000</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">my_string</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"bus"</td>
<td style="user-select: auto !important;">"bs"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"nice to meet you"</td>
<td style="user-select: auto !important;">"nc t mt y"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"bus"에서 모음 u를 제거한 "bs"를 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"nice to meet you"에서 모음 i, o, e, u를 모두 제거한 "nc t mt y"를 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges