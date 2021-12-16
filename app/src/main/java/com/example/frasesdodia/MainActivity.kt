package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frase = arrayOf(
        "Tudo posso naquele que me fortalece (Filipenses 4:3)",
        "Deus é o nosso refúgio e a nossa fortaleza, auxílio sempre presente na adversidade. (Salmos 46:1)",
        "Até aqui o Senhor nos ajudou. (1 Samuel 7:12b)",
        "O Senhor lutará por vocês; tão somente acalmem-se.(Êxodo 14:14)",
        "Porque Deus tanto amou o mundo que deu o seu Filho Unigênito, para que todo o que nele crer não pereça, mas tenha a vida eterna (João 3:16)",
        "Que diremos, pois, diante dessas coisas? Se Deus é por nós, quem será contra nós? (Romanos 8:31)",
        "Bendiga o Senhor a minha alma! Não esqueça nenhuma de suas bênçãos! (Salmos 103:2) ",
        "Embora esteja nas alturas, o Senhor olha para os humildes, e de longe reconhece os arrogantes. (Salmos 138:6)",
        "No princípio, era o Verbo, e o Verbo estava com Deus, e o Verbo era Deus (João 1:1)",
        "Quem está entre os vivos tem esperança; até um cachorro vivo é melhor do que um leão morto! (Eclesiastes 9:4)",
        "Tu és o meu refúgio e a minha fortaleza, o meu Deus, em quem confio. (Salmos 91:2b)",
        "Ensina-me o teu caminho, Senhor, para que eu ande na tua verdade; dá-me um coração inteiramente fiel,para que eu tema o teu nome. (Salmos 86:11)",
        "Eu disse essas coisas para que em mim vocês tenham paz. Neste mundo vocês terão aflições; contudo, tenham ânimo! Eu venci o mundo  (João 16:33)",
        "Quem ama o dinheiro jamais terá o suficiente; (Eclesiastes 5:10a) ",
        "Prepara-se o cavalo para o dia da batalha, mas o Senhor é que dá a vitória. (Provérbios 21:31)",
        "Deem graças ao Senhor porque ele é bom; o seu amor dura para sempre. (Salmos 107:1)",
        "Mil poderão cair ao seu lado; dez mil, à sua direita, mas nada o atingirá. (Salmos 91:7)"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById<TextView>(R.id.textView)
    }
    fun buttonFraseDoDia(view:View){
        val totalIntensArray = frase.size
        val numeroAleatorio = Random().nextInt(totalIntensArray)

        texto.setText (frase[numeroAleatorio])
    }

}