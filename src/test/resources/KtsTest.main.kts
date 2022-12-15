@file:Repository("file:/C:/Users/ootop/.m2/repository")
@file:DependsOn("org.apache.commons:commons-lang3:3.12.0")
@file:DependsOn("com.google.code.gson:gson:2.10")

import com.google.gson.GsonBuilder
import org.apache.commons.lang3.StringUtils
import org.jetbrains.kotlin.script.util.DependsOn
import org.jetbrains.kotlin.script.util.Repository
import java.io.File

println("ttt")
println(StringUtils.isEmpty(""))
val map = HashMap<String, String>()
map["a"] = "b"
var s = GsonBuilder().create().toJson(map)
println(s)
val localRepo = File(File(System.getProperty("user.home")!!, ".m2"), "repository")
println(localRepo)