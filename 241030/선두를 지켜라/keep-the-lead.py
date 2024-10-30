# 입력 받기
N, M = map(int, input().split())
A_moves = [tuple(map(int, input().split())) for _ in range(N)]
B_moves = [tuple(map(int, input().split())) for _ in range(M)]

# 초기 위치와 변수 설정
A_pos = B_pos = lead_changes = 0
A_i = B_i = A_t = B_t = 0
leader = None

# 선두 바뀜 횟수 찾기
while A_i < N and B_i < M:
    # 이동할 시간 설정
    time = min(A_moves[A_i][1] - A_t, B_moves[B_i][1] - B_t)
    A_pos += A_moves[A_i][0] * time
    B_pos += B_moves[B_i][0] * time

    # 현재 선두 판단
    if A_pos > B_pos:
        new_leader = 'A'
    elif B_pos > A_pos:
        new_leader = 'B'
    else:
        new_leader = leader  # 같은 위치일 경우 선두 유지

    # 선두 변경 확인
    if new_leader != leader:
        if leader is not None:  # 첫 번째는 제외
            lead_changes += 1
        leader = new_leader

    # 시간 업데이트 및 이동 종료 확인
    A_t += time
    B_t += time

    if A_t == A_moves[A_i][1]:
        A_i += 1
        A_t = 0
    if B_t == B_moves[B_i][1]:
        B_i += 1
        B_t = 0

print(lead_changes)