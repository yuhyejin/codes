# [level 0] 이어 붙인 수 - 181928 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181928) 

### 성능 요약

메모리: 9.44 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 10월 27일 00:18:40

### 문제 설명

<p style="user-select: auto !important;">정수가 담긴 리스트 <code style="user-select: auto !important;">num_list</code>가 주어집니다. <code style="user-select: auto !important;">num_list</code>의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">2 ≤ <code style="user-select: auto !important;">num_list</code>의 길이 ≤ 10</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">num_list</code>의 원소 ≤ 9</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">num_list</code>에는 적어도 한 개씩의 짝수와 홀수가 있습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">num_list</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[3, 4, 5, 2, 1]</td>
<td style="user-select: auto !important;">393</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[5, 7, 8, 3]</td>
<td style="user-select: auto !important;">581</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">홀수만 이어 붙인 수는 351이고 짝수만 이어 붙인 수는 42입니다. 두 수의 합은 393입니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">홀수만 이어 붙인 수는 573이고 짝수만 이어 붙인 수는 8입니다. 두 수의 합은 581입니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges