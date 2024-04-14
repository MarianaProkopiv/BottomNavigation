package com.example.bottomnavigation.botoomNav
import androidx.compose.foundation.background
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun ButtomNavigation(
    navController: NavController
) {
    val listItems= listOf(
        BottomItem.screenShelf,
        BottomItem.screenUser,
        BottomItem.screenSettings)
    NavigationBar(
        Modifier.background(Color.Blue)
    )
    {
        val BackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute=BackStackEntry?.destination?.route
        var activeIconIndex by remember { mutableStateOf(0) }
        listItems.forEach {item->
            
            NavigationBarItem(
                selected =currentRoute ==item.route,
                onClick = {
                    navController.navigate(item.route)
                },
                icon = {
                    if (activeIconIndex == item.iconId) {
                        Icon(
                            painter = painterResource(id = item.iconIdact),
                            contentDescription = "Active Icon"
                        )
                    } else {
                        Icon(
                            painter = painterResource(id = item.iconId),
                            contentDescription = "Inactive Icon"
                        )
                    }
                },
                label = {
                    Text(text = item.title, fontSize = 9.sp)
                }
            )
            
//            NavigationBarItem(
//                selected = currentRoute ==item.route,
//                onClick = { /*TODO*/ },
//                icon = { Icon(painter = painterResource(id = item.iconId), contentDescription ="Icon" )},
//                label ={ Text(text = item.title, fontSize = 9.sp)},
//                colors = NavigationBarItemDefaults.colors(
//                    selectedIconColor = Color.White,
//                    unselectedIconColor = Color.
//                )
//                
//            )
            
        }


    }
}