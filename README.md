Kompleksitas:

1. Waktu: O(n)
Di dalam loop, setiap karakter dari string diperiksa sekali.
Pushing dan popping dari stack masing-masing memerlukan waktu konstan.

2. Ruang: O(n)
Ruang yang digunakan oleh stack sesuai dengan jumlah karakter tanda kurung buka yang belum ditutup.
Dalam skenario terburuk, kita akan memproses setiap karakter dalam string, yaitu O(n). Kompleksitas ini sangat efisien untuk masalah ini karena kita hanya melewati string sekali dan melakukan operasi konstan pada stack.




