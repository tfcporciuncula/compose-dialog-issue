package com.fredporciuncula.composedialogissue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.fredporciuncula.composedialogissue.ui.theme.ComposeDialogIssueTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposeDialogIssueTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
          Greeting("Android")
        }
      }
    }

    // comment the entire setContent() call above and uncomment the line below to see a regular dialog
//    android.app.AlertDialog.Builder(this).setMessage("Old dialog (non compose) sw320dp").create().show()
  }
}

@Composable
fun Greeting(name: String) {
  Dialog(onDismissRequest = {}) {
    Surface(shape = MaterialTheme.shapes.medium) {
      Text(
        text = "Compose dialog ",
        modifier = Modifier
          .fillMaxWidth()
          .padding(vertical = 100.dp),
      )
    }
  }

  // or:
//  AlertDialog(
//    onDismissRequest = {},
//    buttons = {},
//    text = {
//      Text(
//        text = "Compose alert dialog ",
//        modifier = Modifier.fillMaxWidth(),
//      )
//    },
//  )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  ComposeDialogIssueTheme {
    Greeting("Android")
  }
}