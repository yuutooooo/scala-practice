error id: DADDB65040AA6567744DA3C08AF8E008
file://<WORKSPACE>/Hello.scala
### org.scalameta.invariants.InvariantFailedException: invariant failed:
when verifying scala.meta.internal.trees.`package`.XtensionTreesType(tpe).isConstructable
found that scala.meta.internal.trees.`package`.XtensionTreesType(tpe).isConstructable is false
where tpe = ("yuto", 21)


occurred in the presentation compiler.



action parameters:
uri: file://<WORKSPACE>/Hello.scala
text:
```scala
object HelloWorld {
    def main(args: Array[String]): Unit = {
        println("hello world !")
        val newUser = new ("yuto", 21)
        newUser.printUser()
    }
}
```


presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:





#### Error stacktrace:

```
org.scalameta.invariants.InvariantFailedException$.raise(InvariantFailedException.scala:26)
	scala.meta.Init$.apply(Trees.scala:1321)
	scala.meta.Init$.apply(Trees.scala:1319)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$initImpl$1(ScalametaParser.scala:3988)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:388)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:393)
	scala.meta.internal.parsers.ScalametaParser.initImpl(ScalametaParser.scala:3988)
	scala.meta.internal.parsers.ScalametaParser.initRestAt(ScalametaParser.scala:4021)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$initRest$2(ScalametaParser.scala:4035)
	scala.Option.getOrElse(Option.scala:201)
	scala.meta.internal.parsers.ScalametaParser.initRest(ScalametaParser.scala:4031)
	scala.meta.internal.parsers.ScalametaParser.initInsideTemplate(ScalametaParser.scala:3974)
	scala.meta.internal.parsers.ScalametaParser.init(ScalametaParser.scala:4110)
	scala.meta.internal.parsers.ScalametaParser.templateParents(ScalametaParser.scala:4126)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$template$1(ScalametaParser.scala:4168)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:328)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:383)
	scala.meta.internal.parsers.ScalametaParser.template(ScalametaParser.scala:4153)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$simpleExpr0$2(ScalametaParser.scala:2173)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:328)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:383)
	scala.meta.internal.parsers.ScalametaParser.simpleExpr0(ScalametaParser.scala:2171)
	scala.meta.internal.parsers.ScalametaParser.simpleExpr(ScalametaParser.scala:2151)
	scala.meta.internal.parsers.ScalametaParser.prefixExpr(ScalametaParser.scala:2148)
	scala.meta.internal.parsers.ScalametaParser.postfixExpr(ScalametaParser.scala:2012)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$expr$2(ScalametaParser.scala:1646)
	scala.meta.internal.parsers.ScalametaParser.atPosOpt(ScalametaParser.scala:332)
	scala.meta.internal.parsers.ScalametaParser.autoPosOpt(ScalametaParser.scala:386)
	scala.meta.internal.parsers.ScalametaParser.expr(ScalametaParser.scala:1567)
	scala.meta.internal.parsers.ScalametaParser.expr(ScalametaParser.scala:1470)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$patDefOrDcl$1(ScalametaParser.scala:3459)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:388)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:393)
	scala.meta.internal.parsers.ScalametaParser.patDefOrDcl(ScalametaParser.scala:3449)
	scala.meta.internal.parsers.ScalametaParser.defOrDclOrSecondaryCtor(ScalametaParser.scala:3420)
	scala.meta.internal.parsers.ScalametaParser.localDef(ScalametaParser.scala:4385)
	scala.meta.internal.parsers.ScalametaParser.getStat$1(ScalametaParser.scala:4413)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$blockStatSeq$5(ScalametaParser.scala:4421)
	scala.meta.internal.parsers.ScalametaParser$.doWhile(ScalametaParser.scala:4490)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$blockStatSeq$1(ScalametaParser.scala:4421)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$blockStatSeq$1$adapted(ScalametaParser.scala:4394)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$listBy(ScalametaParser.scala:560)
	scala.meta.internal.parsers.ScalametaParser.blockStatSeq(ScalametaParser.scala:4394)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$blockOnBrace$2(ScalametaParser.scala:2472)
	scala.meta.internal.parsers.ScalametaParser.inBracesOnOpen(ScalametaParser.scala:267)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$blockOnBrace$1(ScalametaParser.scala:2470)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:328)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:383)
	scala.meta.internal.parsers.ScalametaParser.blockOnBrace(ScalametaParser.scala:2470)
	scala.meta.internal.parsers.ScalametaParser.blockOnBrace(ScalametaParser.scala:2472)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$blockExprOnBrace$1(ScalametaParser.scala:2475)
	scala.meta.internal.parsers.ScalametaParser.blockExprPartial(ScalametaParser.scala:2454)
	scala.meta.internal.parsers.ScalametaParser.blockExprOnBrace(ScalametaParser.scala:2474)
	scala.meta.internal.parsers.ScalametaParser.simpleExpr0(ScalametaParser.scala:2167)
	scala.meta.internal.parsers.ScalametaParser.simpleExpr(ScalametaParser.scala:2151)
	scala.meta.internal.parsers.ScalametaParser.prefixExpr(ScalametaParser.scala:2148)
	scala.meta.internal.parsers.ScalametaParser.postfixExpr(ScalametaParser.scala:2012)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$expr$2(ScalametaParser.scala:1646)
	scala.meta.internal.parsers.ScalametaParser.atPosOpt(ScalametaParser.scala:332)
	scala.meta.internal.parsers.ScalametaParser.autoPosOpt(ScalametaParser.scala:386)
	scala.meta.internal.parsers.ScalametaParser.expr(ScalametaParser.scala:1567)
	scala.meta.internal.parsers.ScalametaParser.expr(ScalametaParser.scala:1470)
	scala.meta.internal.parsers.ScalametaParser.defn$1(ScalametaParser.scala:3774)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$funDefRest$1(ScalametaParser.scala:3778)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:388)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:393)
	scala.meta.internal.parsers.ScalametaParser.funDefRest(ScalametaParser.scala:3758)
	scala.meta.internal.parsers.ScalametaParser.funDefOrDclOrExtensionOrSecondaryCtor(ScalametaParser.scala:3729)
	scala.meta.internal.parsers.ScalametaParser.defOrDclOrSecondaryCtor(ScalametaParser.scala:3425)
	scala.meta.internal.parsers.ScalametaParser.nonLocalDefOrDcl(ScalametaParser.scala:3404)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$templateStat$1.applyOrElse(ScalametaParser.scala:4353)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$templateStat$1.applyOrElse(ScalametaParser.scala:4350)
	scala.PartialFunction.$anonfun$runWith$1(PartialFunction.scala:231)
	scala.PartialFunction.$anonfun$runWith$1$adapted(PartialFunction.scala:230)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4314)
	scala.meta.internal.parsers.ScalametaParser.getStats$2(ScalametaParser.scala:4340)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$scala$meta$internal$parsers$ScalametaParser$$templateStatSeq$4(ScalametaParser.scala:4341)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$scala$meta$internal$parsers$ScalametaParser$$templateStatSeq$4$adapted(ScalametaParser.scala:4339)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$listBy(ScalametaParser.scala:560)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$templateStatSeq(ScalametaParser.scala:4339)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$templateBodyOnLeftBrace$2(ScalametaParser.scala:4193)
	scala.meta.internal.parsers.ScalametaParser.inBracesOnOpen(ScalametaParser.scala:267)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$templateBodyOnLeftBrace$1(ScalametaParser.scala:4193)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:328)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:383)
	scala.meta.internal.parsers.ScalametaParser.templateBodyOnLeftBrace(ScalametaParser.scala:4193)
	scala.meta.internal.parsers.ScalametaParser.templateBodyOpt(ScalametaParser.scala:4200)
	scala.meta.internal.parsers.ScalametaParser.templateAfterExtends(ScalametaParser.scala:4148)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$templateOpt$3(ScalametaParser.scala:4184)
	scala.Option.getOrElse(Option.scala:201)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$templateOpt$1(ScalametaParser.scala:4182)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:328)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:383)
	scala.meta.internal.parsers.ScalametaParser.templateOpt(ScalametaParser.scala:4182)
	scala.meta.internal.parsers.ScalametaParser.objectDef(ScalametaParser.scala:3902)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$tmplDef$1(ScalametaParser.scala:3828)
	scala.meta.internal.parsers.ScalametaParser.autoEndPosOpt(ScalametaParser.scala:391)
	scala.meta.internal.parsers.ScalametaParser.autoEndPosOpt(ScalametaParser.scala:395)
	scala.meta.internal.parsers.ScalametaParser.tmplDef(ScalametaParser.scala:3824)
	scala.meta.internal.parsers.ScalametaParser.topLevelTmplDef(ScalametaParser.scala:3818)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4327)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4321)
	scala.PartialFunction.$anonfun$runWith$1(PartialFunction.scala:231)
	scala.PartialFunction.$anonfun$runWith$1$adapted(PartialFunction.scala:230)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4314)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$statSeq$1(ScalametaParser.scala:4303)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$statSeq$1$adapted(ScalametaParser.scala:4303)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$listBy(ScalametaParser.scala:560)
	scala.meta.internal.parsers.ScalametaParser.statSeq(ScalametaParser.scala:4303)
	scala.meta.internal.parsers.ScalametaParser.bracelessPackageStats$1(ScalametaParser.scala:4474)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$source$1(ScalametaParser.scala:4477)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:328)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:383)
	scala.meta.internal.parsers.ScalametaParser.source(ScalametaParser.scala:4442)
	scala.meta.internal.parsers.ScalametaParser.entrypointSource(ScalametaParser.scala:4480)
	scala.meta.internal.parsers.ScalametaParser.parseSourceImpl(ScalametaParser.scala:121)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$parseSource$1(ScalametaParser.scala:118)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:60)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:55)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:118)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:30)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:37)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:22)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:15)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:161)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:57)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:551)
```
#### Short summary: 

org.scalameta.invariants.InvariantFailedException: invariant failed:
when verifying scala.meta.internal.trees.`package`.XtensionTreesType(tpe).isConstructable
found that scala.meta.internal.trees.`package`.XtensionTreesType(tpe).isConstructable is false
where tpe = ("yuto", 21)
