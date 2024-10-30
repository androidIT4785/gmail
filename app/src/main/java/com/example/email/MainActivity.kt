package com.example.email
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : ComponentActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var emailAdapter: EmailAdapter
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView1)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val emailList = listOf(
            Email("HocWeb.vn", "Khóa học thiết kế web...", "12:34 PM"),
            Email("Nguyễn Văn A", "Cập nhật về chiến dịch mới...", "11:22 AM"),
            Email("Khoahoc.vn", "Khóa học miễn phí về...", "11:04 AM"),
            Email("Hỗ trợ OVH", "OVH Việt Nam - http://www.ovh...", "10:26 AM"),
            Email(
                "Lê Minh",
                "Chào bạn, mình muốn xác nhận lại lịch họp cho tuần tới. Rất mong...",
                "10:30 AM"
            ),
            Email(
                "Ngọc Ánh",
                "Cảm ơn bạn đã ứng tuyển vào công ty chúng tôi. Chúng tôi vui mừng thông báo rằng...",
                "9:15 AM"
            ),
            Email(
                "Văn Kiên",
                "Đơn hàng của bạn đã được gửi đi và dự kiến sẽ đến vào...",
                "Hôm qua"
            ),
            Email(
                "Thanh Hương",
                "Giao dịch gần đây của bạn với số tiền 500.000 đồng đã được xử lý. Vui lòng kiểm tra lại...",
                "Thứ Hai"
            ),
            Email(
                "Khuyến mãi",
                "Giảm giá lên đến 50% cho lần mua tiếp theo khi bạn sử dụng mã...",
                "Chủ Nhật"
            )
        )
        emailAdapter = EmailAdapter(emailList)
        recyclerView.adapter = emailAdapter
        val itemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)

        val dividerDrawable = ContextCompat.getDrawable(this, R.drawable.custom_divider)
        itemDecoration.setDrawable(dividerDrawable!!)

        recyclerView.addItemDecoration(itemDecoration)
    }
}