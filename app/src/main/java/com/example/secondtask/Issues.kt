package com.example.secondtask

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.max


data class Issue(
    val title: String,
    val description: String,
    val createdAt: String,
    val status: String
)
val sampleIssues = listOf(
    Issue("Bump pyarrow from 745584dffh", "NONE", "2023-11-9, 23:0 PM", "Open"),
    Issue("Français", "NONE", "2023-11-2, 9:38 AM", "Open"),
    Issue("Bump werkzeug from 4685555585", "NONE", "2023-10-25, 18:52 PM", "Open"),
    Issue("Bump urllib3 from 1.2.3588858788558", "NONE", "2023-10-17, 22:59 PM", "Open"),
    Issue("ORQA fine tuning with using 25885", "NONE", "2023-10-9, 15:3 PM", "Open"),
    Issue("Bump pillow from 9.2.3.68585688", "NONE", "2023-10-4, 0:35 AM", "Open")
)
@Composable
fun IssueItem(issue: Issue) {
    Box (modifier= Modifier.padding(8.dp).clip(shape = RoundedCornerShape(20.dp))
        .fillMaxWidth()
        .height(110.dp)
        .background(color = Color.White)
    ){
        Column (horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(3.dp)){
            Row (verticalAlignment = Alignment.CenterVertically,
//                        modifier = Modifier.fillMaxWidth()
            ){
                Image(painter = painterResource(id = R.drawable.record_removebg_preview), contentDescription = "image",
                    modifier = Modifier
                        .width(30.dp)
                        .height(50.dp))
                Text(text = issue.title, fontSize = 20.sp, fontWeight = FontWeight.Bold, maxLines = 1,overflow = TextOverflow.Ellipsis
                , modifier = Modifier.width(300.dp))
//              Spacer(modifier = Modifier.width(70.dp))
                Text(text = issue.status,fontSize = 14.sp ,
//                    modifier=Modifier.padding(start = 70.dp)
                )

            }
            Column(modifier = Modifier.padding(start = 30.dp)) {
                Text(text =issue.description)
                Row (verticalAlignment = Alignment.CenterVertically){
                    Text(text = "Created At:", modifier = Modifier.padding(top = 5.dp),
                        fontWeight = FontWeight.Bold)
                    Text(text = issue.createdAt, modifier = Modifier.padding(top = 5.dp, start = 2.dp))
                }
            }
        }
    }
}
@Composable
fun IssueList(issues: List<Issue>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(issues) { issue ->
            IssueItem(issue = issue)
        }
    }
}