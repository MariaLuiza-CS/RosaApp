package com.example.rosaapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.rosaapp.ui.theme.BackgroundColor
import com.example.rosaapp.ui.theme.BlackCustom
import com.example.rosaapp.ui.theme.BlackLightCustom
import com.example.rosaapp.ui.theme.Green
import com.example.rosaapp.ui.theme.Peach

@Composable
fun FeelingScreen(
    navController: NavHostController
) {
    val scrollState = rememberScrollState()
    SetStatusBarColor(color = BackgroundColor)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor)
            .verticalScroll(state = scrollState)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 30.dp),
                text = "Sentimento",
                style = MaterialTheme.typography.bodyLarge,
                color = BlackLightCustom
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            modifier = Modifier.padding(horizontal = 30.dp),
            text = "Ah, mas você vai escrever um texto e blá blá blá coisa de gay... SILÊNCIO.\n" +
                    "\n" +
                    "Não vou escrever nada muito romântico, perdão a quebra de expectativa. Apenas queria lembrar a você que gosto muito da sua pessoa.\n" +
                    "\n" +
                    "Você me faz muito bem, muito MEIIIXXMO. Confesso que às vezes não sei lidar muito bem com isso e fico um pouco com medo e insegura, porque gosto bastante de você e aí minha cabeça fica AAAAAAAAAAAAAAAAAA.\n" +
                    "\n" +
                    "Eu discutia com Natália pois não sou uma pessoa que se abre muito e se deixa ficar vulnerável, e eu via isso como uma coisa boa, no fundo era só medo de me machucar e da opinião alheia, mas desde que você entrou na minha vida tem me mostrado que isso pode ser uma coisa boa.\n" +
                    "\n" +
                    "Tem a possibilidade de você me dar um pé na bunda qualquer dia desses? Sim, porém vale a pena a tentativa e não anula as outras partes.\n" +
                    "\n" +
                    "Fazer as coisas juntinhas e compartilhar a vida com outra pessoa pode ser uma coisa legal; dormir de bundinha, tomar cafezinho, assistir casimiro, fofocar, surtar juntas...\n" +
                    "\n" +
                    "Quando você está dormindo de boca aberta, com o maxilar deslocado e eu fico alisando seu cabelinho, escutando a sua respiração... não sei explicar essa sensação, acho que pode ser definido como uma coisa leve, um quentinho no coração, uma vontade de explodir. E quando eu falo uma coisa leve, não significa que são tudo flores e unicórnios fofinhos, nenhuma relação é assim, mas fico com um pensamento de “vai passar, a gente resolve”, sinto que tenho abertura para conversar com você sobre coisas que me incomodam.\n" +
                    "\n" +
                    "Inclusive gosto de quando a gente conversa e tenta expor nossos pontos. Não acho que isso desgasta, pelo contrário, se não conversar e ficar só martelando na nossa cabecinha é pior.\n" +
                    "\n" +
                    "Eu poderia ficar escrevendo aqui 300 coisas, mentira, não poderia não, você sabe que eu tenho a capacidade de um tubarão de expor meus sentimentos.\n" +
                    "\n" +
                    "Apenas saiba que eu te amo e adoro ter você na minha vida.",
            style = MaterialTheme.typography.titleMedium,
            color = BlackLightCustom
        )

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.padding(30.dp),
                painter = painterResource(id = R.drawable.image_25),
                contentDescription = ""
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
    }
}