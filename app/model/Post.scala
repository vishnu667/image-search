package model

/**
 * Created by vishnu on 19/3/15.
 */
class Post(postBuilder: PostBuilder) {
  val title:String=postBuilder.title
  val content:String=postBuilder.content
  val id:Long=postBuilder.id
  val userId:Long=postBuilder.userId
  def save():Unit = {
    //Should contain the sql query for storing in the Database
  }
}
class PostBuilder{
  var title:String=""
  var content:String=""
  var id:Long=0
  var userId:Long=0
  def build(): Post ={
    new Post(this)
  }
  
  def PostBuilder(postId:Long):Post = {
  val builder = new PostBuilder
    builder.id=postId
    builder.build()
  }
}