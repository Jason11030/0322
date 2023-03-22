package tw.edu.pu.o1103021.a0322

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var  txv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        txv.setOnClickListener({
           if (txv.text == "你好嗎？？"){
               txv.text ="雙刀還是太刀,太刀最好"
           }else{
               txv.text="大錘還是大劍"
           }
        })

    }
}