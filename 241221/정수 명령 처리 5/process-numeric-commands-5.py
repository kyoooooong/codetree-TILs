A = int(input())  # 명령어의 개수 입력
arr = []          # 배열 초기화

for _ in range(A):
    input_str = input()
    
    if input_str.startswith('push_back'):  # 'push_back' 처리
        _, integer = input_str.split()
        arr.append(int(integer))  # 배열의 끝에 추가
    
    elif input_str.startswith('get'):  # 'get' 처리
        _, index = input_str.split()
        index = int(index) - 1  # 입력은 1-based index이므로 0-based로 변환
        if 0 <= index < len(arr):
            print(arr[index])  # 배열의 index 위치 값 출력
        else:
            print("Error: Index out of bounds")
    
    elif input_str == 'size':  # 'size' 처리
        print(len(arr))  # 배열의 크기 출력
    
    elif input_str == 'pop_back':  # 'pop_back' 처리
        if arr:
            arr.pop()  # 배열의 마지막 원소 제거
        else:
            print("Error: Cannot pop from an empty array")