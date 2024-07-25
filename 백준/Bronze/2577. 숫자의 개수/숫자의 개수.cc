#include <iostream>
using namespace std;

int main() {

	int a, b, c, r;
	int num[10] = { 0, };

	cin >> a;
	cin >> b;
	cin >> c;

	r = a * b * c;

	for (int i = 0; i < 10; i++) {
		if (r == 0) {
			break;
		}

		num[r % 10] += 1;
		r = (r - (r % 10)) / 10;
	}
	for (int j = 0; j < 10; j++) {
		cout << num[j] << "\n";
	}

	return 0;
}
