package com.example.studentprofileapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studentprofileapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Khởi tạo ViewBinding để liên kết với giao diện activity_main.xml
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Bắt sự kiện bấm nút btnNext (đã định nghĩa ở file XML màn hình chính)
        binding.btnNext.setOnClickListener {
            // Sử dụng Explicit Intent chỉ định rõ đích đến là SecondActivity (tham khảo Bài 2 Lab 3)
            val intent = Intent(this, SecondActivity::class.java).apply {
                // Truyền dữ liệu dạng chuỗi (Extra) sang màn hình đích
                putExtra("EXTRA_DATA", "Xin chào! Dữ liệu được gửi từ Màn hình 1.")
            }
            startActivity(intent)
        }
    }
}