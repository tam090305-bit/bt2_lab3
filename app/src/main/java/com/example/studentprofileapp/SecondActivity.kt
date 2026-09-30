package com.example.studentprofileapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studentprofileapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Khởi tạo ViewBinding để liên kết với giao diện activity_second.xml
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Nhận dữ liệu gửi sang từ MainActivity thông qua Intent Extras
        val receivedData = intent.getStringExtra("EXTRA_DATA")
        if (!receivedData.isNullOrEmpty()) {
            // Hiển thị dữ liệu nhận được lên TextView (tvResult)
            binding.tvResult.text = receivedData
        }

        // Xử lý sự kiện bấm nút btnBack để quay lại màn hình 1
        binding.btnBack.setOnClickListener {
            // Dùng finish() để đóng màn hình hiện tại và tự động quay về màn hình trước đó
            finish()
        }
    }
}