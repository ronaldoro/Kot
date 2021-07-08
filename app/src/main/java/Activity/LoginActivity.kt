package Activity

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.testkotproj.R
import java.net.Socket

class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout_p)

        //val ip = "58.77.73.201"
        val ip = "58.77.73.201"
        //val ip = "127.0.0.1" //Local
        val port = 7788

        var idText = findViewById<EditText>(R.id.IdEditText)
        var pwText = findViewById<EditText>(R.id.PwEditText)

        var loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val socket = Socket(ip, port)
            val outStream = socket.outputStream

            val data = idText.toString()
            outStream.write(data.toByteArray())
        }
    }
}