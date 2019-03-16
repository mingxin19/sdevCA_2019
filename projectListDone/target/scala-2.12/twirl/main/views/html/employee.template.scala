
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object employee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employee: List[models.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""

"""),_display_(/*3.2*/main("Employee",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Employee</p>

"""),_display_(/*7.2*/if(flash.containsKey("success"))/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
  """),format.raw/*8.3*/("""<div class="alert alert-success">
    """),_display_(/*9.6*/flash/*9.11*/.get("success")),format.raw/*9.26*/("""
  """),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">

  <thead>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Email</th>
      <th colspan="2"></th>      
    </tr>
  </thead>

  <tbody>
    """),_display_(/*25.6*/for(e<-employee) yield /*25.22*/ {_display_(Seq[Any](format.raw/*25.24*/("""
      """),format.raw/*26.7*/("""<tr>
        <td class="numeric">"""),_display_(/*27.30*/e/*27.31*/.getId),format.raw/*27.37*/("""</td>
        <td>"""),_display_(/*28.14*/e/*28.15*/.getName),format.raw/*28.23*/("""</td>
        <td>"""),_display_(/*29.14*/e/*29.15*/.getEmail),format.raw/*29.24*/("""</td>
        <td>
          <a href=""""),_display_(/*31.21*/routes/*31.27*/.HomeController.updateEmployee(e.getId)),format.raw/*31.66*/("""" class="button-xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>  
        <td>
          <a href=""""),_display_(/*36.21*/routes/*36.27*/.HomeController.deleteEmployee(e.getId)),format.raw/*36.66*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*41.6*/("""
  """),format.raw/*42.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*46.13*/routes/*46.19*/.HomeController.addEmployee()),format.raw/*46.48*/("""">
    <button class="btn btn-primary">Add an Employee</button>
  </a>
</p>

""")))}))
      }
    }
  }

  def render(employee:List[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employee,user)

  def f:((List[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employee,user) => apply(employee,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 14:59:05 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/employee.scala.html
                  HASH: aa394683188b71a1a218df5e5d87aa277bea7361
                  MATRIX: 984->1|1137->59|1165->62|1194->83|1233->85|1261->87|1317->118|1357->150|1396->152|1425->155|1489->194|1502->199|1537->214|1567->217|1605->225|1634->227|1875->442|1907->458|1947->460|1981->467|2042->501|2052->502|2079->508|2125->527|2135->528|2164->536|2210->555|2220->556|2250->565|2316->604|2331->610|2391->649|2575->806|2590->812|2650->851|2849->1020|2879->1023|2941->1058|2956->1064|3006->1093
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|57->25|57->25|57->25|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|63->31|63->31|63->31|68->36|68->36|68->36|73->41|74->42|78->46|78->46|78->46
                  -- GENERATED --
              */
          