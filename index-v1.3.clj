{:namespaces
 ({:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/accumulators.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/accumulators-api.html",
   :name "clojure.contrib.accumulators",
   :author "Konrad Hinsen",
   :doc
   "A generic accumulator interface and implementations of various\naccumulators."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/agent_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/agent-utils-api.html",
   :name "clojure.contrib.agent-utils",
   :author "Christophe Grande",
   :doc
   "Miscellaneous agent utilities\n(note to other contrib members: feel free to add to this lib)"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/base64.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/base64-api.html",
   :name "clojure.contrib.base64",
   :author "Stuart Sierra",
   :doc
   "Base-64 encoding and decoding.  \n\nThis is mainly here as an example.  It is much slower than the\nApache Commons Codec implementation or sun.misc.BASE64Encoder."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/classpath.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/classpath-api.html",
   :name "clojure.contrib.classpath",
   :author "Stuart Sierra",
   :doc "Utilities for dealing with the JVM's classpath"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/combinatorics-api.html",
   :name "clojure.contrib.combinatorics",
   :author "Mark Engelberg",
   :doc
   "Efficient, functional algorithms for generating lazy\nsequences for common combinatorial functions. (See the source code \nfor a longer description.)"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/command_line.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/command-line-api.html",
   :name "clojure.contrib.command-line",
   :author "Chris Houser",
   :doc "Process command-line arguments according to a given cmdspec"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/complex_numbers.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/complex-numbers-api.html",
   :name "clojure.contrib.complex-numbers",
   :author "Konrad Hinsen",
   :doc
   "Complex numbers\nNOTE: This library is in evolution. Most math functions are\n      not implemented yet."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/cond.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/cond-api.html",
   :name "clojure.contrib.cond",
   :author "Stephen C. Gilardi",
   :doc "Extensions to the basic cond function."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/condition.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/condition-api.html",
   :name "clojure.contrib.condition",
   :author "Stephen C. Gilardi",
   :doc
   "Flexible raising and handling of conditions:\n\nFunctions:\n\n              raise: raises a condition\n       handler-case: dispatches raised conditions to appropriate handlers\n  print-stack-trace: prints abbreviated or full condition stack traces\n\nData:\n\n  A condition is a map containing values for these keys:\n\n    - :type, a condition type specifier, typically a keyword\n    - :stack-trace, a stack trace to the site of the raise\n    - :message, a human-readable message (optional)\n    - :cause, a wrapped exception or condition (optional)\n    - other keys given as arguments to raise (optional)\n\nNote: requires AOT compilation.\n\nBased on an idea from Chouser:\nhttp://groups.google.com/group/clojure/browse_frm/thread/da1285c538f22bb5"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/core.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/core-api.html",
   :name "clojure.contrib.core",
   :author "Laurent Petit (and others)",
   :doc
   "Functions/macros variants of the ones that can be found in clojure.core \n(note to other contrib members: feel free to add to this lib)"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/dataflow-api.html",
   :name "clojure.contrib.dataflow",
   :author "Jeffrey Straszheim",
   :doc "A library to support a dataflow model of state"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/datalog.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog-api.html",
   :name "clojure.contrib.datalog",
   :author "Jeffrey Straszheim",
   :doc "A Clojure implementation of Datalog"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/def.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/def-api.html",
   :name "clojure.contrib.def",
   :author "Stephen C. Gilardi",
   :doc
   "def.clj provides variants of def that make including doc strings and\nmaking private definitions more succinct."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/error_kit.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/error-kit-api.html",
   :name "clojure.contrib.error-kit",
   :author "Chris Houser",
   :doc
   "EXPERIMENTAL\nSystem for defining and using custom errors\nPlease contact Chouser if you have any suggestions for better names\nor API adjustments."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/except.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/except-api.html",
   :name "clojure.contrib.except",
   :author "Stephen C. Gilardi",
   :doc
   "Provides functions that make it easy to specify the class, cause, and\nmessage when throwing an Exception or Error. The optional message is\nformatted using clojure.core/format."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/fcase.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/fcase-api.html",
   :name "clojure.contrib.fcase",
   :author "Stuart Sierra",
   :doc
   "This file defines a generic \"case\" macro called \"fcase\" which takes\nthe equality-testing function as an argument.  It also defines a\ntraditional \"case\" macro that tests using \"=\" and variants that\ntest for regular expressions and class membership.\n\n\nNote (December 23, 2008): This library has been supplanted by the\ninclusion of \"condp\" in clojure.core as of Clojure SVN rev. 1180."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/find-namespaces-api.html",
   :name "clojure.contrib.find-namespaces",
   :author "Stuart Sierra",
   :doc "Search for ns declarations in dirs, JARs, or CLASSPATH"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/fnmap.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/fnmap-api.html",
   :name "clojure.contrib.fnmap",
   :author "Stuart Sierra",
   :doc
   "Maps that dispatch get/assoc to user-defined functions.\n\nNote: requires AOT-compilation"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/gen_html_docs.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/gen-html-docs-api.html",
   :name "clojure.contrib.gen-html-docs",
   :author "Craig Andera",
   :doc
   "Generates a single HTML page that contains the documentation for\none or more Clojure libraries."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/generic.arithmetic-api.html",
   :name "clojure.contrib.generic.arithmetic",
   :author "Konrad Hinsen",
   :doc
   "Generic arithmetic interface\nThis library defines generic versions of + - * / as multimethods\nthat can be defined for any type. The minimal required \nimplementations for a type are binary + and * plus unary - and /.\nEverything else is derived from these automatically. Explicit\nbinary definitions for - and / can be provided for\nefficiency reasons."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/generic/collection.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/generic.collection-api.html",
   :name "clojure.contrib.generic.collection",
   :author "Konrad Hinsen",
   :doc
   "Generic arithmetic interface\nThis library defines generic versions of common\ncollection-related functions as multimethods that can be\ndefined for any type."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/generic.comparison-api.html",
   :name "clojure.contrib.generic.comparison",
   :author "Konrad Hinsen",
   :doc
   "Generic comparison interface\nThis library defines generic versions of = < > <= >= zero?\nas multimethods that can be defined for any type. Of the\ngreater/less-than relations, types must minimally implement >."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/generic/functor.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/generic.functor-api.html",
   :name "clojure.contrib.generic.functor",
   :author "Konrad Hinsen",
   :doc "Generic functor interface (fmap)"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/generic.math-functions-api.html",
   :name "clojure.contrib.generic.math-functions",
   :author "Konrad Hinsen",
   :doc
   "Generic math function interface\nThis library defines generic versions of common mathematical\nfunctions such as sqrt or sin as multimethods that can be\ndefined for any type."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/graph-api.html",
   :name "clojure.contrib.graph",
   :author "Jeffrey Straszheim",
   :doc "Basic graph theory algorithms"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/greatest_least.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/greatest-least-api.html",
   :name "clojure.contrib.greatest-least",
   :author "Vincent Foley",
   :doc
   "Various functions for finding greatest and least values in a collection"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/import_static.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/import-static-api.html",
   :name "clojure.contrib.import-static",
   :author "Stuart Sierra",
   :doc "Import static Java methods/fields into Clojure"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/jar.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/jar-api.html",
   :name "clojure.contrib.jar",
   :author "Stuart Sierra",
   :doc "Utilities for working with Java JAR files"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/java_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/java-utils-api.html",
   :name "clojure.contrib.java-utils",
   :author
   "Stuart Halloway, Stephen C. Gilardi, Shawn Hoover, Perry Trolard, Stuart Sierra",
   :doc
   "A set of utilties for dealing with Java stuff like files and properties.\n\nDesign goals:\n\n(1) Ease-of-use. These APIs should be convenient. Performance is secondary.\n\n(2) Duck typing. I hate having to think about the difference between\n    a string that names a file, and a File. Ditto for a ton of other \n    wrapper classes in the Java world (URL, InternetAddress). With these\n    APIs you should be able to think about domain equivalence, not type\n    equivalence.\n\n(3) No bossiness. I am not marking any of these functions as private\n    the docstrings will tell you the intended usage but do what works for you. \t\t\t\t\t\n\nFeedback welcome!\n\nIf something in this module violates the principle of least surprise, please \nlet me (Stu) and the Clojure community know via the mailing list.\nContributors:\n\nStuart Halloway\nStephen C. Gilardi\nShawn Hoover\nPerry Trolard\nStuart Sierra"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/jmx.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/jmx-api.html",
   :name "clojure.contrib.jmx",
   :author "Stuart Halloway",
   :doc
   "JMX support for Clojure\n\nRequires post-Clojure 1.0 git edge for clojure.test, clojure.backtrace.\nThis is prerelease.\nThis API will change.\nSend reports to stu@thinkrelevance.com.\n\nUsage\n  (require '[clojure.contrib.jmx :as jmx])\n\nWhat beans do I have?\n\n  (jmx/mbean-names \"*:*\")\n  -> #<HashSet [java.lang:type=MemoryPool,name=CMS Old Gen, \n                java.lang:type=Memory, ...]\n\nWhat attributes does a bean have?\n\n  (jmx/attribute-names \"java.lang:type=Memory\")\n  -> (:Verbose :ObjectPendingFinalizationCount \n      :HeapMemoryUsage :NonHeapMemoryUsage)\n\nWhat is the value of an attribute? \n\n  (jmx/read \"java.lang:type=Memory\" :ObjectPendingFinalizationCount)\n  -> 0\n\nCan't I just have *all* the attributes in a Clojure map?\n\n  (jmx/mbean \"java.lang:type=Memory\")\n  -> {:NonHeapMemoryUsage\n       {:used 16674024, :max 138412032, :init 24317952, :committed 24317952},\n      :HeapMemoryUsage\n       {:used 18619064, :max 85393408, :init 0, :committed 83230720},\n      :ObjectPendingFinalizationCount 0,\n      :Verbose false}\n\nCan I find and invoke an operation?\n\n  (jmx/operation-names \"java.lang:type=Memory\")\n  -> (:gc)  \n  (jmx/invoke \"java.lang:type=Memory\" :gc)\n  -> nil\n\nWhat about some other process? Just run *any* of the above code\ninside a with-connection:\n\n  (jmx/with-connection {:host \"localhost\", :port 3000} \n    (jmx/mbean \"java.lang:type=Memory\"))\n  -> {:ObjectPendingFinalizationCount 0, \n      :HeapMemoryUsage ... etc.}\n\nCan I serve my own beans?  Sure, just drop a Clojure ref\ninto an instance of clojure.contrib.jmx.Bean, and the bean\nwill expose read-only attributes for every key/value pair\nin the ref:\n\n  (jmx/register-mbean\n     (Bean.\n     (ref {:string-attribute \"a-string\"}))\n     \"my.namespace:name=Value\")"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/json.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/json-api.html",
   :name "clojure.contrib.json",
   :author "Stuart Sierra",
   :doc
   "JavaScript Object Notation (JSON) parser/writer.\nSee http://www.json.org/\nTo write JSON, use json-str, write-json, or write-json.\nTo read JSON, use read-json."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/lazy_seqs.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/lazy-seqs-api.html",
   :name "clojure.contrib.lazy-seqs",
   :author "Stephen C. Gilardi",
   :doc
   "\n==== Lazy sequences ====\n\n primes - based on the \"naive\" implemention described in [1] plus a\n          small \"wheel\" which eliminates multiples of 2, 3, 5, and\n          7 from consideration by incrementing past them. Also inspired\n          by code from Christophe Grand in [2].\n\n fibs   - all the Fibonacci numbers\n\n powers-of-2 - all the powers of 2\n\n ==== Lazy sequence functions ====\n\n (partition-all, shuffle moved to clojure.core)\n (rand-elt moved to clojure.core/rand-nth)\n (rotations, rand-elt  moved to seq_utils.clj)\n (permutations and combinations moved to combinatorics.clj)\n\n [1] http://www.cs.hmc.edu/~oneill/papers/Sieve-JFP.pdf\n [2] http://clj-me.blogspot.com/2008/06/primes.html"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/lazy_xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/lazy-xml-api.html",
   :name "clojure.contrib.lazy-xml",
   :author "Chris Houser",
   :doc "Functions to parse xml lazily and emit back to text."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/logging-api.html",
   :name "clojure.contrib.logging",
   :author
   "Alex Taggart, with contributions and suggestions by Chris Dean, Phil\n  Hagelberg, Richard Newman, and Timothy Pratley",
   :doc
   "Logging macros which delegate to a specific logging implementation. At\nruntime a specific implementation is selected from, in order, Apache\ncommons-logging, slf4j, log4j, and finally java.util.logging.\n\nLogging levels are specified by clojure keywords corresponding to the\nvalues used in log4j and commons-logging:\n  :trace, :debug, :info, :warn, :error, :fatal\n\nLogging occurs with the log macro, or the level-specific convenience macros,\nwhich write either directly or via an agent.  See log* for more details\nregarding direct vs agent logging.\n\nThe log macros will not evaluate their 'message' unless the specific logging\nlevel is in effect. Alternately, you can use the spy macro when you have code\nthat needs to be evaluated, and also want to output the code and its result to\nthe log.\n\nUnless otherwise specified, the current namespace (as identified by *ns*) will\nbe used as the log-ns (similar to how the java class name is usually used).\nNote: your log configuration should display the name that was passed to the\nlogging implementation, and not perform stack-inspection, otherwise you'll see\nsome ugly and unhelpful text in your logs.\n\nUse the enabled? macro to write conditional code against the logging level\n(beyond simply whether or not to call log, which is handled automatically).\n\nYou can redirect all java writes of System.out and System.err to the log\nsystem by calling log-capture!.  To bind *out* and *err* to the log system\ninvoke with-logs.  In both cases a log-ns (e.g., \"com.example.captured\")\nmust be specified in order to namespace the output.\n\nFor those new to using a java logging library, the following is a very basic\nconfiguration for log4j. Place it in a file called \"log4j.properties\"\nand place that file (and the log4j JAR) on the classpath.\n  log4j.rootLogger=WARN, A1\n  log4j.logger.user=DEBUG\n  log4j.appender.A1=org.apache.log4j.ConsoleAppender\n  log4j.appender.A1.layout=org.apache.log4j.PatternLayout\n  log4j.appender.A1.layout.ConversionPattern=%d %-5p %c: %m%n\nThe above will print messages to the console for :debug or higher if one is\nin the user namespace, and :warn or higher in all other namespaces."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/macro_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/macro-utils-api.html",
   :name "clojure.contrib.macro-utils",
   :author "Konrad Hinsen",
   :doc
   "Local macros and symbol macros\n\nLocal macros are defined by a macrolet form. They are usable only\ninside its body. Symbol macros can be defined globally\n(defsymbolmacro) or locally (symbol-macrolet). A symbol\nmacro defines a form that replaces a symbol during macro\nexpansion. Function arguments and symbols bound in let\nforms are not subject to symbol macro expansion.\n\nLocal macros are most useful in the definition of the expansion\nof another macro, they may be used anywhere. Global symbol\nmacros can be used only inside a with-symbol-macros form."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/macros.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/macros-api.html",
   :name "clojure.contrib.macros",
   :author "Konrad Hinsen",
   :doc "Various small macros"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/map_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/map-utils-api.html",
   :name "clojure.contrib.map-utils",
   :author "Jason Wolfe, Chris Houser",
   :doc "Utilities for operating on Clojure maps."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/math.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/math-api.html",
   :name "clojure.contrib.math",
   :author "Mark Engelberg",
   :doc
   "Math functions that deal intelligently with the various\ntypes in Clojure's numeric tower, as well as math functions\ncommonly found in Scheme implementations.\n\nexpt - (expt x y) is x to the yth power, returns an exact number\n  if the base is an exact number, and the power is an integer,\n  otherwise returns a double.\nabs - (abs n) is the absolute value of n\ngcd - (gcd m n) returns the greatest common divisor of m and n\nlcm - (lcm m n) returns the least common multiple of m and n\n\nThe behavior of the next three functions on doubles is consistent\nwith the behavior of the corresponding functions\nin Java's Math library, but on exact numbers, returns an integer.\n\nfloor - (floor n) returns the greatest integer less than or equal to n.\n  If n is an exact number, floor returns an integer,\n  otherwise a double.\nceil - (ceil n) returns the least integer greater than or equal to n.\n  If n is an exact number, ceil returns an integer,\n  otherwise a double.\nround - (round n) rounds to the nearest integer.\n  round always returns an integer.  round rounds up for values\n  exactly in between two integers.\n\n\nsqrt - Implements the sqrt behavior I'm accustomed to from PLT Scheme,\n  specifically, if the input is an exact number, and is a square\n  of an exact number, the output will be exact.  The downside\n  is that for the common case (inexact square root), some extra\n  computation is done to look for an exact square root first.\n  So if you need blazingly fast square root performance, and you\n  know you're just going to need a double result, you're better\n  off calling java's Math/sqrt, or alternatively, you could just\n  convert your input to a double before calling this sqrt function.\n  If Clojure ever gets complex numbers, then this function will\n  need to be updated (so negative inputs yield complex outputs).\nexact-integer-sqrt - Implements a math function from the R6RS Scheme\n  standard.  (exact-integer-sqrt k) where k is a non-negative integer,\n  returns [s r] where k = s^2+r and k < (s+1)^2.  In other words, it\n  returns the floor of the square root and the "}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/miglayout.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/miglayout-api.html",
   :name "clojure.contrib.miglayout",
   :author "Stephen C. Gilardi",
   :doc
   "Clojure support for the MiGLayout layout manager\nhttp://www.miglayout.com/\n\nExample:\n\n  (use '[clojure.contrib.miglayout.test :as mlt :only ()])\n  (dotimes [i 5] (mlt/run-test i))"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mmap.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/mmap-api.html",
   :name "clojure.contrib.mmap",
   :author "Chris Houser",
   :doc
   "Functions for memory-mapping files, plus some functions that use a\nmmaped file for \"normal\" activies -- slurp, load-file, etc."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/mock-api.html",
   :name "clojure.contrib.mock",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/monadic_io_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/monadic-io-streams-api.html",
   :name "clojure.contrib.monadic-io-streams",
   :author "Konrad Hinsen",
   :doc
   "Monadic I/O with Java input/output streams\nDefines monadic I/O statements to be used in a state monad\nwith an input or output stream as the state. The macro\nmonadic-io creates a stream, runs a monadic I/O statement\non it, and closes the stream. This structure permits the\ndefinition of purely functional compound I/O statements\nwhich are applied to streams that can never escape from the\nmonadic statement sequence."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/monads-api.html",
   :name "clojure.contrib.monads",
   :author "Konrad Hinsen",
   :doc
   "This library contains the most commonly used monads as well\nas macros for defining and using monads and useful monadic\nfunctions."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/ns_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/ns-utils-api.html",
   :name "clojure.contrib.ns-utils",
   :author "Stephen C. Gilardi",
   :doc "Namespace utilities"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/priority_map.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/priority-map-api.html",
   :name "clojure.contrib.priority-map",
   :author "Mark Engelberg",
   :doc
   "A priority map is very similar to a sorted map, but whereas a sorted map produces a\nsequence of the entries sorted by key, a priority map produces the entries sorted by value.\nIn addition to supporting all the functions a sorted map supports, a priority map\ncan also be thought of as a queue of [item priority] pairs.  To support usage as\na versatile priority queue, priority maps also support conj/peek/pop operations.\n\nThe standard way to construct a priority map is with priority-map:\nuser=> (def p (priority-map :a 2 :b 1 :c 3 :d 5 :e 4 :f 3))\n#'user/p\nuser=> p\n{:b 1, :a 2, :c 3, :f 3, :e 4, :d 5}\n\nSo :b has priority 1, :a has priority 2, and so on.\nNotice how the priority map prints in an order sorted by its priorities (i.e., the map's values)\n\nWe can use assoc to assign a priority to a new item:\nuser=> (assoc p :g 1)\n{:b 1, :g 1, :a 2, :c 3, :f 3, :e 4, :d 5}\n\nor to assign a new priority to an extant item:\nuser=> (assoc p :c 4)\n{:b 1, :a 2, :f 3, :c 4, :e 4, :d 5}\n\nWe can remove an item from the priority map:\nuser=> (dissoc p :e)\n{:b 1, :a 2, :c 3, :f 3, :d 5}\n\nAn alternative way to add to the priority map is to conj a [item priority] pair:\nuser=> (conj p [:g 0])\n{:g 0, :b 1, :a 2, :c 3, :f 3, :e 4, :d 5}\n\nor use into:\nuser=> (into p [[:g 0] [:h 1] [:i 2]])\n{:g 0, :b 1, :h 1, :a 2, :i 2, :c 3, :f 3, :e 4, :d 5}\n\nPriority maps are countable:\nuser=> (count p)\n6\n\nLike other maps, equivalence is based not on type, but on contents.\nIn other words, just as a sorted-map can be equal to a hash-map,\nso can a priority-map.\nuser=> (= p {:b 1, :a 2, :c 3, :f 3, :e 4, :d 5})\ntrue\n\nYou can test them for emptiness:\nuser=> (empty? (priority-map))\ntrue\nuser=> (empty? p)\nfalse\n\nYou can test whether an item is in the priority map:\nuser=> (contains? p :a)\ntrue\nuser=> (contains? p :g)\nfalse\n\nIt is easy to look up the priority of a given item, using any of the standard map mechanisms:\nuser=> (get p :a)\n2\nuser=> (get p :g 10)\n10\nuser=> (p :a)\n2\nuser=> (:a p)\n2\n\nPriority maps derive much of their utility by providing priority-based seq.\nNote that no guarantees are made about the order in which items of the same priority appear.\nuser=> (seq p)\n([:b 1] [:a 2] [:c 3] [:f 3] [:e 4] [:d 5])\nBecause no guarantees are made about the order of same-priority items, note that\nrseq might not be an exact reverse of the seq.  It is only guaranteed to be in\ndescending order.\nuser=> (rseq p)\n([:d 5] [:e 4] [:c 3] [:f 3] [:a 2] [:b 1])\n\nThis means first/rest/next/for/map/etc. all operate in priority order.\nuser=> (first p)\n[:b 1]\nuser=> (rest p)\n([:a 2] [:c 3] [:f 3] [:e 4] [:d 5])\n\nPriority maps support metadata:\nuser=> (meta (with-meta p {:extra :info}))\n{:extra :info}\n\nBut perhaps most importantly, priority maps can also function as priority queues.\npeek, like first, gives you the first [item priority] pair in the collection.\npop removes the first [item priority] from the collection.\n(Note that unlike rest, which returns a seq, pop returns a priority map).\n\nuser=> (peek p)\n[:b 1]\nuser=> (pop p)\n{:a 2, :c 3, :f 3, :e 4, :d 5}\n\nIt is also possible to use a custom comparator:\nuser=> (priority-map-by (comparator >) :a 1 :b 2 :c 3)\n{:c 3, :b 2, :a 1}\n\nAll of these operations are efficient.  Generally speaking, most operations\nare O(log n) where n is the number of distinct priorities.  Some operations\n(for example, straightforward lookup of an item's priority, or testing\nwhether a given item is in the priority map) are as efficient\nas Clojure's built-in map.\n\nThe key to this efficiency is that internally, not only does the priority map store\nan ordinary hash map of items to priority, but it also stores a sorted map that\nmaps priorities to sets of items with that priority.\n\nA typical textbook priority queue data structure supports at the ability to add\na [item priority] pair to the queue, and to pop/peek the next [item priority] pair.\nBut many real-world applications of priority queues require more features, such\nas the ability to test whether something is already in the queue, or to reassign\na priority.  For example, a standard formulation of Dijkstra's algorithm requires the\nability to reduce the priority number associated with a given item.  Once you\nthrow persistence into the mix with the desire to adjust priorities, the traditional\nstructures just don't work that well.\n\nThis particular blend of Clojure's built-in hash sets, hash maps, and sorted maps\nproved to be a great way to implement an especially flexible persistent priority queue.\n\nConnoisseurs of algorithms will note that this structure's peek operation is not O(1) as\nit would be if based upon a heap data structure, but I feel this is a small concession for\nthe blend of persistence, priority reassignment, and priority-sorted seq, which can be\nquite expensive to achieve with a heap (I did actually try this for comparison).  Furthermore,\nthis peek's logarithmic behavior is quite good (on my computer I can do a million\npeeks at a priority map with a million items in 750ms).  Also, consider that peek and pop\nusually follow one another, and even with a heap, pop is logarithmic.  So the net combination\nof peek and pop is not much different between this versatile formulation of a priority map and\na more limited heap-based one.  In a nutshell, peek, although not O(1), is unlikely to be the\nbottleneck in your program.\n\nAll in all, I hope you will find priority maps to be an easy-to-use and useful addition\nto Clojure's assortment of built-in maps (hash-map and sorted-map)."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/probabilities/finite_distributions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/probabilities.finite-distributions-api.html",
   :name "clojure.contrib.probabilities.finite-distributions",
   :author "Konrad Hinsen",
   :doc
   "Finite probability distributions\nThis library defines a monad for combining finite probability\ndistributions."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/probabilities.monte-carlo-api.html",
   :name "clojure.contrib.probabilities.monte-carlo",
   :author "Konrad Hinsen",
   :doc
   "Monte-Carlo method support\n\nMonte-Carlo methods transform an input random number stream\n(usually having a continuous uniform distribution in the\ninterval [0, 1)) into a random number stream whose distribution\nsatisfies certain conditions (usually the expectation value\nis equal to some desired quantity). They are thus\ntransformations from one probability distribution to another one.\n\nThis library represents a Monte-Carlo method by a function that\ntakes as input the state of a random number stream with\nuniform distribution (see\nclojure.contrib.probabilities.random-numbers) and returns a\nvector containing one sample value of the desired output\ndistribution and the final state of the input random number\nstream. Such functions are state monad values and can be\ncomposed using operations defined in clojure.contrib.monads."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/probabilities/random_numbers.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/probabilities.random-numbers-api.html",
   :name "clojure.contrib.probabilities.random-numbers",
   :author "Konrad Hinsen",
   :doc
   "Random number streams\n\nThis library provides random number generators with a common\nstream interface. They all produce pseudo-random numbers that are\nuniformly distributed in the interval [0, 1), i.e. 0 is a\npossible value but 1 isn't. For transformations to other\ndistributions, see clojure.contrib.probabilities.monte-carlo.\n\nAt the moment, the only generator provided is a rather simple\nlinear congruential generator."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/profile.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/profile-api.html",
   :name "clojure.contrib.profile",
   :author "Stuart Sierra",
   :doc
   "Simple code profiling & timing measurement.\n\nWrap any section of code in the prof macro, giving it a name, like this:\n\n       (defn my-function [x y]\n         (let [sum (prof :addition (+ x y))\n               product (prof :multiplication (* x y))]\n           [sum product]))\n\nThe run your code in the profile macro, like this:\n\n       (profile (dotimes [i 10000] (my-function 3 4)))\n\nWhich prints a report for each named section of code:\n\n          Name      mean       min       max     count       sum\n      addition       265         0     37000     10000   2655000\nmultiplication       274         0     53000     10000   2747000\n\nTimes are measured in nanoseconds, to the maximum precision available\nunder the JVM.  See the function documentation for more details."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/prxml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/prxml-api.html",
   :name "clojure.contrib.prxml",
   :author "Stuart Sierra",
   :doc
   "Compact syntax for generating XML. See the documentation of \"prxml\" \nfor details."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/reflect.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/reflect-api.html",
   :name "clojure.contrib.reflect",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/repl_ln.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/repl-ln-api.html",
   :name "clojure.contrib.repl-ln",
   :author "Stephen C. Gilardi",
   :doc
   "A repl with that provides support for lines and line numbers in the\ninput stream."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/repl_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/repl-utils-api.html",
   :name "clojure.contrib.repl-utils",
   :author
   "Chris Houser, Christophe Grand, Stephen Gilardi, Michel Salim",
   :doc "Utilities meant to be used interactively at the REPL"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/seq.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/seq-api.html",
   :name "clojure.contrib.seq",
   :author "Stuart Sierra (and others)",
   :doc "Sequence utilities for Clojure"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/server_socket.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/server-socket-api.html",
   :name "clojure.contrib.server-socket",
   :author "Craig McDaniel",
   :doc "Server socket library - includes REPL on socket"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/set.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/set-api.html",
   :name "clojure.contrib.set",
   :author "Jason Wolfe",
   :doc
   "Clojure functions for operating on sets (supplemental to clojure.set)"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/singleton.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/singleton-api.html",
   :name "clojure.contrib.singleton",
   :author "Stuart Sierra",
   :doc "Singleton functions"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/sql.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/sql-api.html",
   :name "clojure.contrib.sql",
   :author "Stephen C. Gilardi",
   :doc "A Clojure interface to sql databases via jdbc."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/stream_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/stream-utils-api.html",
   :name "clojure.contrib.stream-utils",
   :author "Konrad Hinsen",
   :doc
   "Functions for setting up computational pipelines via data streams.\n\nNOTE: This library is experimental. It may change significantly\n      with future release.\n\nThis library defines:\n- an abstract stream type, whose interface consists of the\n  multimethod stream-next\n- a macro for implementing streams\n- implementations of stream for\n  1) Clojure sequences, and vectors\n  2) nil, representing an empty stream\n- tools for writing stream transformers, including the\n  monad stream-m\n- various utility functions for working with streams\n\nStreams are building blocks in the construction of computational\npipelines. A stream is represented by its current state plus\na function that takes a stream state and obtains the next item\nin the stream as well as the new stream state. The state is\nimplemented as a Java class or a Clojure type (as defined by the\nfunction clojure.core/type), and the function is provided as an\nimplementation of the multimethod stream-next for this class or type.\n\nWhile setting up pipelines using this mechanism is somewhat more\ncumbersome than using Clojure's lazy seq mechanisms, there are a\nfew advantages:\n- The state of a stream can be stored in any Clojure data structure,\n  and the stream can be re-generated from it any number of times.\n  Any number of states can be stored this way.\n- The elements of the stream are never cached, so keeping a reference\n  to a stream state does not incur an uncontrollable memory penalty.\n\nNote that the stream mechanism is thread-safe as long as the\nconcrete stream implementations do not use any mutable state.\n\nStream transformers take any number of input streams and produce one\noutput stream. They are typically written using the stream-m\nmonad. In the definition of a stream transformer, (pick s) returns\nthe next value of stream argument s, whereas pick-all returns the\nnext value of all stream arguments in the form of a vector."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/strint.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/strint-api.html",
   :name "clojure.contrib.strint",
   :author "Chas Emerick",
   :doc "String interpolation for Clojure."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/swing_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/swing-utils-api.html",
   :name "clojure.contrib.swing-utils",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/test_base64.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/test-base64-api.html",
   :name "clojure.contrib.test-base64",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/trace.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/trace-api.html",
   :name "clojure.contrib.trace",
   :author "Stuart Sierra, Michel Salim",
   :doc
   "This file defines simple \"tracing\" macros to help you see what your\ncode is doing."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/types.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/types-api.html",
   :name "clojure.contrib.types",
   :author "Konrad Hinsen",
   :doc "General and algebraic data types"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/with_ns.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/with-ns-api.html",
   :name "clojure.contrib.with-ns",
   :author "Stuart Sierra",
   :doc "Temporary namespace macro"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/zip_filter.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/zip-filter-api.html",
   :name "clojure.contrib.zip-filter",
   :author "Chris Houser",
   :doc
   "System for filtering trees and nodes generated by zip.clj in\ngeneral, and xml trees in particular."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/condition/Condition.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/condition.Condition-api.html",
   :name "clojure.contrib.condition.Condition",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog.database-api.html",
   :name "clojure.contrib.datalog.database",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/datalog/literals.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog.literals-api.html",
   :name "clojure.contrib.datalog.literals",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/datalog/magic.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog.magic-api.html",
   :name "clojure.contrib.datalog.magic",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog.rules-api.html",
   :name "clojure.contrib.datalog.rules",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/datalog/softstrat.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog.softstrat-api.html",
   :name "clojure.contrib.datalog.softstrat",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/datalog/util.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog.util-api.html",
   :name "clojure.contrib.datalog.util",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/miglayout/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/miglayout.internal-api.html",
   :name "clojure.contrib.miglayout.internal",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock/test_adapter.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/mock.test-adapter-api.html",
   :name "clojure.contrib.mock.test-adapter",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/sql/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/sql.internal-api.html",
   :name "clojure.contrib.sql.internal",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/zip_filter/xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/zip-filter.xml-api.html",
   :name "clojure.contrib.zip-filter.xml",
   :doc nil}),
 :vars
 ({:arglists ([acc items]),
   :name "add-items",
   :namespace "clojure.contrib.accumulators",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L38",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/add-items",
   :doc
   "Add all elements of a collection coll to the accumulator acc.",
   :var-type "function",
   :line 38,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L272",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-counter",
   :namespace "clojure.contrib.accumulators",
   :line 272,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty counter accumulator. Its value is a map that stores for\nevery item the number of times it was added.",
   :name "empty-counter"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L293",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-counter-with-total",
   :namespace "clojure.contrib.accumulators",
   :line 293,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty counter-with-total accumulator. It works like the counter\naccumulator, except that the total number of items added is stored as the\nvalue of the key :total.",
   :name "empty-counter-with-total"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L89",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-list",
   :namespace "clojure.contrib.accumulators",
   :line 89,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty list accumulator. Adding an item appends it at the beginning.",
   :name "empty-list"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L146",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-map",
   :namespace "clojure.contrib.accumulators",
   :line 146,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty map accumulator. Items to be added must be [key value] pairs.",
   :name "empty-map"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L186",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-maximum",
   :namespace "clojure.contrib.accumulators",
   :line 186,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc "An empty maximum accumulator. Only numbers can be added.",
   :name "empty-maximum"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L233",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-mean-variance",
   :namespace "clojure.contrib.accumulators",
   :line 233,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty mean-variance accumulator, combining sample mean and\nsample variance. Only numbers can be added.",
   :name "empty-mean-variance"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L208",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-min-max",
   :namespace "clojure.contrib.accumulators",
   :line 208,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty min-max accumulator, combining minimum and maximum.\nOnly numbers can be added.",
   :name "empty-min-max"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L192",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-minimum",
   :namespace "clojure.contrib.accumulators",
   :line 192,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc "An empty minimum accumulator. Only numbers can be added.",
   :name "empty-minimum"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L178",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-product",
   :namespace "clojure.contrib.accumulators",
   :line 178,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc "An empty sum accumulator. Only numbers can be added.",
   :name "empty-product"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L103",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-queue",
   :namespace "clojure.contrib.accumulators",
   :line 103,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty queue accumulator. Adding an item appends it at the end.",
   :name "empty-queue"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L117",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-set",
   :namespace "clojure.contrib.accumulators",
   :line 117,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc "An empty set accumulator.",
   :name "empty-set"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L131",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-string",
   :namespace "clojure.contrib.accumulators",
   :line 131,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty string accumulator. Adding an item (string or character)\nappends it at the end.",
   :name "empty-string"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L175",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-sum",
   :namespace "clojure.contrib.accumulators",
   :line 175,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc "An empty sum accumulator. Only numbers can be added.",
   :name "empty-sum"}
  {:arglists ([empty-accumulators]),
   :name "empty-tuple",
   :namespace "clojure.contrib.accumulators",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L311",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-tuple",
   :doc
   "Returns an accumulator tuple with the supplied empty-accumulators\nas its value. Accumulator tuples consist of several accumulators that\nwork in parallel. Added items must be sequences whose number of elements\nmatches the number of sub-accumulators.",
   :var-type "function",
   :line 311,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a9eeece7663e11f6841d59a3efdef8c12b65633b/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj#L75",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-vector",
   :namespace "clojure.contrib.accumulators",
   :line 75,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/accumulators/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty vector accumulator. Adding an item appends it at the end.",
   :name "empty-vector"}
  {:arglists ([vars agent action & args]),
   :name "capture-and-send",
   :namespace "clojure.contrib.agent-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/agent-utils/src/main/clojure/clojure/contrib/agent_utils.clj#L22",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/agent-utils/src/main/clojure/clojure/contrib/agent_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//agent-utils-api.html#clojure.contrib.agent-utils/capture-and-send",
   :doc
   "Capture the current value of the specified vars and rebind \nthem on the agent thread before executing the action.\n\nExample:\n  (capture-and-send [*out*] a f b c)",
   :var-type "macro",
   :line 22,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/agent-utils/src/main/clojure/clojure/contrib/agent_utils.clj"}
  {:arglists ([str-reader out]),
   :name "decode",
   :namespace "clojure.contrib.base64",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/base64.clj#L106",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/base64.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//base64-api.html#clojure.contrib.base64/decode",
   :doc
   "Decodes base64-encoded content from str-reader. Writes resulting bytes to out.",
   :var-type "function",
   :line 106,
   :file "clojure/contrib/base64.clj"}
  {:arglists ([s] [s encoding]),
   :name "decode-str",
   :namespace "clojure.contrib.base64",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/base64.clj#L138",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/base64.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//base64-api.html#clojure.contrib.base64/decode-str",
   :doc
   "Decodes base64-encoded String using encoding. Encoding defaults to UTF-8.",
   :var-type "function",
   :line 138,
   :file "clojure/contrib/base64.clj"}
  {:arglists ([input output alphabet line-length]),
   :name "encode",
   :namespace "clojure.contrib.base64",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/base64.clj#L36",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/base64.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//base64-api.html#clojure.contrib.base64/encode",
   :doc
   "Encodes bytes of input, writing Base 64 text on output.  alphabet\nis a 65-character String containing the 64 characters to use in the\nencoding; the 65th character is the pad character.  line-length is\nthe maximum number of characters per line, nil for no line breaks.",
   :var-type "function",
   :line 36,
   :file "clojure/contrib/base64.clj"}
  {:arglists ([s] [s encoding line-length]),
   :name "encode-str",
   :namespace "clojure.contrib.base64",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/base64.clj#L88",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/base64.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//base64-api.html#clojure.contrib.base64/encode-str",
   :doc
   "Encodes String in base 64; returns a String.  If not specified,\nencoding is UTF-8 and line-length is nil.",
   :var-type "function",
   :line 88,
   :file "clojure/contrib/base64.clj"}
  {:arglists ([]),
   :name "classpath",
   :namespace "clojure.contrib.classpath",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/classpath.clj#L23",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/classpath.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//classpath-api.html#clojure.contrib.classpath/classpath",
   :doc
   "Returns a sequence of File objects of the elements on CLASSPATH.",
   :var-type "function",
   :line 23,
   :file "clojure/contrib/classpath.clj"}
  {:arglists ([]),
   :name "classpath-directories",
   :namespace "clojure.contrib.classpath",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/classpath.clj#L30",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/classpath.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//classpath-api.html#clojure.contrib.classpath/classpath-directories",
   :doc
   "Returns a sequence of File objects for the directories on classpath.",
   :var-type "function",
   :line 30,
   :file "clojure/contrib/classpath.clj"}
  {:arglists ([]),
   :name "classpath-jarfiles",
   :namespace "clojure.contrib.classpath",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/classpath.clj#L35",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/classpath.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//classpath-api.html#clojure.contrib.classpath/classpath-jarfiles",
   :doc
   "Returns a sequence of JarFile objects for the JAR files on classpath.",
   :var-type "function",
   :line 35,
   :file "clojure/contrib/classpath.clj"}
  {:arglists ([& seqs]),
   :name "cartesian-product",
   :namespace "clojure.contrib.combinatorics",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/499b9c02d1932ba0c0651e04b627c25f7f04f0c8/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj#L107",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/499b9c02d1932ba0c0651e04b627c25f7f04f0c8/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//combinatorics-api.html#clojure.contrib.combinatorics/cartesian-product",
   :doc "All the ways to take one item from each sequence",
   :var-type "function",
   :line 107,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj"}
  {:arglists ([items n]),
   :name "combinations",
   :namespace "clojure.contrib.combinatorics",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/499b9c02d1932ba0c0651e04b627c25f7f04f0c8/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj#L90",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/499b9c02d1932ba0c0651e04b627c25f7f04f0c8/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//combinatorics-api.html#clojure.contrib.combinatorics/combinations",
   :doc
   "All the unique ways of taking n different elements from items",
   :var-type "function",
   :line 90,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj"}
  {:arglists ([c]),
   :name "lex-permutations",
   :namespace "clojure.contrib.combinatorics",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/499b9c02d1932ba0c0651e04b627c25f7f04f0c8/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj#L151",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/499b9c02d1932ba0c0651e04b627c25f7f04f0c8/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//combinatorics-api.html#clojure.contrib.combinatorics/lex-permutations",
   :doc
   "Fast lexicographic permutation generator for a sequence of numbers",
   :var-type "function",
   :line 151,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj"}
  {:arglists ([items]),
   :name "permutations",
   :namespace "clojure.contrib.combinatorics",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/499b9c02d1932ba0c0651e04b627c25f7f04f0c8/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj#L160",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/499b9c02d1932ba0c0651e04b627c25f7f04f0c8/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//combinatorics-api.html#clojure.contrib.combinatorics/permutations",
   :doc "All the permutations of items, lexicographic by index",
   :var-type "function",
   :line 160,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj"}
  {:arglists ([items n]),
   :name "selections",
   :namespace "clojure.contrib.combinatorics",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/499b9c02d1932ba0c0651e04b627c25f7f04f0c8/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj#L127",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/499b9c02d1932ba0c0651e04b627c25f7f04f0c8/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//combinatorics-api.html#clojure.contrib.combinatorics/selections",
   :doc
   "All the ways of taking n (possibly the same) elements from the sequence of items",
   :var-type "function",
   :line 127,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj"}
  {:arglists ([items]),
   :name "subsets",
   :namespace "clojure.contrib.combinatorics",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/499b9c02d1932ba0c0651e04b627c25f7f04f0c8/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj#L101",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/499b9c02d1932ba0c0651e04b627c25f7f04f0c8/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//combinatorics-api.html#clojure.contrib.combinatorics/subsets",
   :doc "All the subsets of items",
   :var-type "function",
   :line 101,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/combinatorics/src/main/clojure/clojure/contrib/combinatorics.clj"}
  {:arglists ([args desc cmdspec & body]),
   :name "with-command-line",
   :namespace "clojure.contrib.command-line",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/command-line/src/main/clojure/clojure/contrib/command_line.clj#L90",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/command-line/src/main/clojure/clojure/contrib/command_line.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//command-line-api.html#clojure.contrib.command-line/with-command-line",
   :doc "Bind locals to command-line args.",
   :var-type "macro",
   :line 90,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/command-line/src/main/clojure/clojure/contrib/command_line.clj"}
  {:arglists ([bindings & clauses]),
   :name "cond-let",
   :namespace "clojure.contrib.cond",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/cond/src/main/clojure/clojure/contrib/cond.clj#L18",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/cond/src/main/clojure/clojure/contrib/cond.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//cond-api.html#clojure.contrib.cond/cond-let",
   :doc
   "Takes a binding-form and a set of test/expr pairs. Evaluates each test\none at a time. If a test returns logical true, cond-let evaluates and\nreturns expr with binding-form bound to the value of test and doesn't\nevaluate any of the other tests or exprs. To provide a default value\neither provide a literal that evaluates to logical true and is\nbinding-compatible with binding-form, or use :else as the test and don't\nrefer to any parts of binding-form in the expr. (cond-let binding-form)\nreturns nil.",
   :var-type "macro",
   :line 18,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/cond/src/main/clojure/clojure/contrib/cond.clj"}
  {:name "*full-stack-traces*",
   :namespace "clojure.contrib.condition",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition.clj#L56",
   :dynamic true,
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition/*full-stack-traces*",
   :doc
   "Bind to true to include clojure.{core,lang,main} frames in stack\ntraces",
   :var-type "var",
   :line 56,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/condition/src/main/clojure/clojure/contrib/condition.clj"}
  {:arglists ([dispatch-fn & body]),
   :name "handler-case",
   :namespace "clojure.contrib.condition",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition.clj#L71",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition/handler-case",
   :doc
   "Executes body in a context where raised conditions can be handled.\n\ndispatch-fn accepts a raised condition (a map) and returns a selector\nused to choose a handler. Commonly, dispatch-fn will be :type to dispatch\non the condition's :type value.\n\nHandlers are forms within body:\n\n  (handle key\n    ...)\n\nIf a condition is raised, executes the body of the first handler whose\nkey satisfies (isa? selector key). If no handlers match, re-raises the\ncondition.\n\nWhile a handler is running, *condition* is bound to the condition being\nhandled and *selector* is bound to to the value returned by dispatch-fn\nthat matched the handler's key.",
   :var-type "macro",
   :line 71,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/condition/src/main/clojure/clojure/contrib/condition.clj"}
  {:arglists ([x]),
   :name "print-stack-trace",
   :namespace "clojure.contrib.condition",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition.clj#L128",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition/print-stack-trace",
   :doc
   "Prints a stack trace for a condition or Throwable. Skips frames for\nclasses in clojure.{core,lang,main} unless the *full-stack-traces* is\nbound to logical true",
   :var-type "function",
   :line 128,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/condition/src/main/clojure/clojure/contrib/condition.clj"}
  {:arglists ([] [m] [key val & keyvals]),
   :name "raise",
   :namespace "clojure.contrib.condition",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition.clj#L60",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition/raise",
   :doc
   "Raises a condition. With no arguments, re-raises the current condition.\nWith one argument (a map), raises the argument. With two or more\narguments, raises a map with keys and values from the arguments.",
   :var-type "macro",
   :line 60,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/condition/src/main/clojure/clojure/contrib/condition.clj"}
  {:arglists ([x form] [x form & forms]),
   :name "-?>",
   :namespace "clojure.contrib.core",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/core.clj#L30",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//core-api.html#clojure.contrib.core/-?>",
   :doc
   "Same as clojure.core/-> but returns nil as soon as the threaded value is nil itself (thus short-circuiting any pending computation).\nExamples :\n(-?> \"foo\" .toUpperCase (.substring 1)) returns \"OO\"\n(-?> nil .toUpperCase (.substring 1)) returns nil\n",
   :var-type "macro",
   :line 30,
   :file "clojure/contrib/core.clj"}
  {:arglists ([x form] [x form & forms]),
   :name "-?>>",
   :namespace "clojure.contrib.core",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/core.clj#L46",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//core-api.html#clojure.contrib.core/-?>>",
   :doc
   "Same as clojure.core/->> but returns nil as soon as the threaded value is nil itself (thus short-circuiting any pending computation).\nExamples :\n(-?>> (range 5) (map inc)) returns (1 2 3 4 5)\n(-?>> [] seq (map inc)) returns nil\n",
   :var-type "macro",
   :line 46,
   :file "clojure/contrib/core.clj"}
  {:arglists ([x form] [x form & forms]),
   :name ".?.",
   :namespace "clojure.contrib.core",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/core.clj#L38",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//core-api.html#clojure.contrib.core/.?.",
   :doc
   "Same as clojure.core/.. but returns nil as soon as the threaded value is nil itself (thus short-circuiting any pending computation).\nExamples :\n(.?. \"foo\" .toUpperCase (.substring 1)) returns \"OO\"\n(.?. nil .toUpperCase (.substring 1)) returns nil\n",
   :var-type "macro",
   :line 38,
   :file "clojure/contrib/core.clj"}
  {:arglists ([m [k & ks :as keys]]),
   :name "dissoc-in",
   :namespace "clojure.contrib.core",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/core.clj#L57",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//core-api.html#clojure.contrib.core/dissoc-in",
   :doc
   "Dissociates an entry from a nested associative structure returning a new\nnested structure. keys is a sequence of keys. Any empty maps that result\nwill not be present in the new structure.",
   :var-type "function",
   :line 57,
   :file "clojure/contrib/core.clj"}
  {:arglists ([class-name & args]),
   :name "new-by-name",
   :namespace "clojure.contrib.core",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/core.clj#L71",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//core-api.html#clojure.contrib.core/new-by-name",
   :doc
   "Constructs a Java object whose class is specified by a String.",
   :var-type "function",
   :line 71,
   :file "clojure/contrib/core.clj"}
  {:arglists ([x]),
   :name "seqable?",
   :namespace "clojure.contrib.core",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/core.clj#L78",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//core-api.html#clojure.contrib.core/seqable?",
   :doc "Returns true if (seq x) will succeed, false otherwise.",
   :var-type "function",
   :line 78,
   :file "clojure/contrib/core.clj"}
  {:arglists ([cell key fun]),
   :name "add-cell-watcher",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L461",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/add-cell-watcher",
   :doc
   "Adds a watcher to a cell to respond to changes of value.  The is a\nfunction of 4 values: a key, the cell, its old value, its new\nvalue.  This is implemented using Clojure's add-watch to the\nunderlying ref, and shared its sematics",
   :var-type "function",
   :line 461,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([df cells]),
   :name "add-cells",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L211",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/add-cells",
   :doc "Given a collection of cells, add them to the dataflow.",
   :var-type "function",
   :line 211,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([cs]),
   :name "build-dataflow",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L189",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/build-dataflow",
   :doc
   "Given a collection of cells, build and return a dataflow object",
   :var-type "function",
   :line 189,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([name init]),
   :name "build-source-cell",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L232",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/build-source-cell",
   :doc "Builds a source cell",
   :var-type "function",
   :line 232,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([name deps fun expr]),
   :name "build-standard-cell",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L293",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/build-standard-cell",
   :doc "Builds a standard cell",
   :var-type "function",
   :line 293,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([deps fun expr]),
   :name "build-validator-cell",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L299",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/build-validator-cell",
   :doc "Builds a validator cell",
   :var-type "function",
   :line 299,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([type & data]),
   :name "cell",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L305",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/cell",
   :doc
   "Build a standard cell, like this:\n\n (cell fred\n    (* ?mary ?joe))\n\nWhich creates a cell named fred that is the product of a cell mary and cell joe\n\nOr:\n\n (cell joe\n   (apply * ?*sally))\n\nWhich creates a cell that applies * to the collection of all cells named sally\n\nOr:\n\n (cell :source fred 0)\n\nWhich builds a source cell fred with initial value 0\n\nOr:\n\n  (cell :validator (when (< ?fred ?sally)\n                       (throwf \"%s must be greater than %s\" ?fred ?sally))\n\nWhich will perform the validation",
   :var-type "macro",
   :line 305,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L349",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/display-cell",
   :namespace "clojure.contrib.dataflow",
   :line 349,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "var",
   :doc "A 'readable' form of the cell",
   :name "display-cell"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L373",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/eval-cell",
   :namespace "clojure.contrib.dataflow",
   :line 373,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "var",
   :doc "Evaluate a dataflow cell.  Return [changed, old val]",
   :name "eval-cell"}
  {:arglists ([df name]),
   :name "get-cell",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L95",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-cell",
   :doc "Get the single cell named by name",
   :var-type "function",
   :line 95,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([df name]),
   :name "get-cells",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L90",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-cells",
   :doc "Get all the cells named by name",
   :var-type "function",
   :line 90,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([df env name]),
   :name "get-old-value",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L137",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-old-value",
   :doc "Looks up an old value",
   :var-type "function",
   :line 137,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([df]),
   :name "get-source-cells",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L109",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-source-cells",
   :doc "Returns a collection of source cells from the dataflow",
   :var-type "function",
   :line 109,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([df name]),
   :name "get-value",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L116",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-value",
   :doc
   "Gets a value from the df matching the passed symbol.\nSignals an error if the name is not present, or if it not a single\nvalue.",
   :var-type "function",
   :line 116,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([cell]),
   :name "get-value-from-cell",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L144",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-value-from-cell",
   :doc "Given a cell, get its value",
   :var-type "function",
   :line 144,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([df name]),
   :name "get-values",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L127",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-values",
   :doc "Gets a collection of values from the df by name",
   :var-type "function",
   :line 127,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([df]),
   :name "print-dataflow",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L200",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/print-dataflow",
   :doc "Prints a dataflow, one cell per line",
   :var-type "function",
   :line 200,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([df cells]),
   :name "remove-cells",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L219",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/remove-cells",
   :doc "Given a collection of cells, remove them from the dataflow.",
   :var-type "function",
   :line 219,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([cell]),
   :name "source-cell?",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L104",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/source-cell?",
   :doc "Is this cell a source cell?",
   :var-type "function",
   :line 104,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([df data]),
   :name "update-values",
   :namespace "clojure.contrib.dataflow",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj#L439",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/update-values",
   :doc
   "Given a dataflow, and a map of name-value pairs, update the\ndataflow by binding the new values.  Each name must be of a source\ncell",
   :var-type "function",
   :line 439,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/dataflow/src/main/clojure/clojure/contrib/dataflow.clj"}
  {:arglists ([rules query]),
   :name "build-work-plan",
   :namespace "clojure.contrib.datalog",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog.clj#L46",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog/build-work-plan",
   :doc
   "Given a list of rules and a query, build a work plan that can be\nused to execute the query.",
   :var-type "function",
   :line 46,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog.clj"}
  {:arglists ([work-plan database query-bindings]),
   :name "run-work-plan",
   :namespace "clojure.contrib.datalog",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog.clj#L56",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog/run-work-plan",
   :doc
   "Given a work plan, a database, and some query bindings, run the\nwork plan and return the results.",
   :var-type "function",
   :line 56,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog.clj"}
  {:arglists ([name orig] [name orig doc]),
   :name "defalias",
   :namespace "clojure.contrib.def",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj#L66",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defalias",
   :doc
   "Defines an alias for a var: a new var with the same root binding (if\nany) and similar metadata. The metadata of the alias is its initial\nmetadata (as provided by def) merged into the metadata of the original.",
   :var-type "macro",
   :line 66,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/def/src/main/clojure/clojure/contrib/def.clj"}
  {:arglists ([sym init]),
   :name "defhinted",
   :namespace "clojure.contrib.def",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj#L85",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defhinted",
   :doc
   "Defines a var with a type hint matching the class of the given\ninit.  Be careful about using any form of 'def' or 'binding' to a\nvalue of a different type.  See http://paste.lisp.org/display/73344",
   :var-type "macro",
   :line 85,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/def/src/main/clojure/clojure/contrib/def.clj"}
  {:arglists ([name & decls]),
   :name "defmacro-",
   :namespace "clojure.contrib.def",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj#L39",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defmacro-",
   :doc "Same as defmacro but yields a private definition",
   :var-type "macro",
   :line 39,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/def/src/main/clojure/clojure/contrib/def.clj"}
  {:arglists ([fn-name & defn-stuff]),
   :name "defn-memo",
   :namespace "clojure.contrib.def",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj#L143",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defn-memo",
   :doc
   "Just like defn, but memoizes the function using clojure.core/memoize",
   :var-type "macro",
   :line 143,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/def/src/main/clojure/clojure/contrib/def.clj"}
  {:arglists ([fn-name & fn-tail]),
   :name "defnk",
   :namespace "clojure.contrib.def",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj#L122",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defnk",
   :doc
   "Define a function accepting keyword arguments. Symbols up to the first\nkeyword in the parameter list are taken as positional arguments.  Then\nan alternating sequence of keywords and defaults values is expected. The\nvalues of the keyword arguments are available in the function body by\nvirtue of the symbol corresponding to the keyword (cf. :keys destructuring).\ndefnk accepts an optional docstring as well as an optional metadata map.",
   :var-type "macro",
   :line 122,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/def/src/main/clojure/clojure/contrib/def.clj"}
  {:arglists ([name expr] [name expr doc]),
   :name "defonce-",
   :namespace "clojure.contrib.def",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj#L59",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defonce-",
   :doc "Same as defonce but yields a private definition",
   :var-type "macro",
   :line 59,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/def/src/main/clojure/clojure/contrib/def.clj"}
  {:arglists ([name & decls]),
   :name "defstruct-",
   :namespace "clojure.contrib.def",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj#L54",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defstruct-",
   :doc "Same as defstruct but yields a private definition",
   :var-type "macro",
   :line 54,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/def/src/main/clojure/clojure/contrib/def.clj"}
  {:arglists ([name] [name doc]),
   :name "defunbound",
   :namespace "clojure.contrib.def",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj#L32",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defunbound",
   :doc "Defines an unbound var with optional doc string",
   :var-type "macro",
   :line 32,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/def/src/main/clojure/clojure/contrib/def.clj"}
  {:arglists ([name & decls]),
   :name "defunbound-",
   :namespace "clojure.contrib.def",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj#L49",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defunbound-",
   :doc "Same as defunbound but yields a private definition",
   :var-type "macro",
   :line 49,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/def/src/main/clojure/clojure/contrib/def.clj"}
  {:arglists ([name] [name init] [name init doc]),
   :name "defvar",
   :namespace "clojure.contrib.def",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj#L23",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defvar",
   :doc "Defines a var with an optional intializer and doc string",
   :var-type "macro",
   :line 23,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/def/src/main/clojure/clojure/contrib/def.clj"}
  {:arglists ([name & decls]),
   :name "defvar-",
   :namespace "clojure.contrib.def",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj#L44",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defvar-",
   :doc "Same as defvar but yields a private definition",
   :var-type "macro",
   :line 44,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/def/src/main/clojure/clojure/contrib/def.clj"}
  {:arglists ([name macro-args]),
   :name "name-with-attributes",
   :namespace "clojure.contrib.def",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj#L96",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/def/src/main/clojure/clojure/contrib/def.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/name-with-attributes",
   :doc
   "To be used in macro definitions.\nHandles optional docstrings and attribute maps for a name to be defined\nin a list of macro arguments. If the first macro argument is a string,\nit is added as a docstring to name and removed from the macro argument\nlist. If afterwards the first macro argument is a map, its entries are\nadded to the name's metadata map and the map is removed from the\nmacro argument list. The return value is a vector containing the name\nwith its extended metadata map and the list of unprocessed macro\narguments.",
   :var-type "function",
   :line 96,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/def/src/main/clojure/clojure/contrib/def.clj"}
  {:arglists ([continue-name [args*] & body]),
   :name "bind-continue",
   :namespace "clojure.contrib.error-kit",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj#L150",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/bind-continue",
   :doc
   "Special form to be used inside a 'with-handler'.\nControl can be passed to this 'continue' form from a 'raise' enclosed\nin this with-handler's dynamic scope, when this 'continue-name' is\ngiven to a 'continue' form.",
   :var-type "function",
   :line 150,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj"}
  {:arglists
   ([name [parent-error?] doc-string? [args*] & body]
    [name [parent-error?] doc-string? args-destruct-map & body]),
   :name "deferror",
   :namespace "clojure.contrib.error-kit",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj#L59",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/deferror",
   :doc "Define a new error type",
   :var-type "macro",
   :line 59,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj"}
  {:arglists ([]),
   :name "do-not-handle",
   :namespace "clojure.contrib.error-kit",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj#L117",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/do-not-handle",
   :doc
   "Use in a tail position of a 'handle' form to indicate 'raise' should\nnot consider the error handled, but should continue searching for an\nappropriate 'handle' form.  Allows finer-grain control over catching\nthan just the error type.",
   :var-type "macro",
   :line 117,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj"}
  {:arglists ([details]),
   :name "error",
   :namespace "clojure.contrib.error-kit",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj#L46",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/error",
   :doc "Base type for all error-kit errors",
   :var-type "function",
   :line 46,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj"}
  {:arglists
   ([error-name? [args*] & body]
    [error-name? args-destruct-map-args & body]),
   :name "handle",
   :namespace "clojure.contrib.error-kit",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj#L138",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/handle",
   :doc
   "Special form to be used inside a 'with-handler'.  When\nany error is 'raised' from withing the dynamic scope of 'body' that\nis of error-name's type or a derived type, the args will be bound\nand the body executed.  If no 'error-name' is given, the body will\nbe executed for regardless of the type of error raised.  The body\nmay return a value, in which case that will be the return value of\nthe entire 'with-handler' form, or it may use any of the special\nreturn forms, 'do-not-handle', 'continue-with', or 'continue'.",
   :var-type "function",
   :line 138,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj"}
  {:arglists ([err-name & args]),
   :name "raise",
   :namespace "clojure.contrib.error-kit",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj#L110",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/raise",
   :doc
   "Raise an error of the type err-name, constructed with the given args",
   :var-type "macro",
   :line 110,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj"}
  {:arglists ([err]),
   :name "raise*",
   :namespace "clojure.contrib.error-kit",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj#L86",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/raise*",
   :doc
   "Raise the given error object, best if created by an error\nconstructor defined with deferror.  See also 'raise' macro.",
   :var-type "function",
   :line 86,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj"}
  {:arglists ([class-name]),
   :name "throw-msg",
   :namespace "clojure.contrib.error-kit",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj#L39",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/throw-msg",
   :doc
   "Returns a function that throws a Java Exception with the given\nname.  Useful to associate a new error-kit error type with a\nparticular Java Exception class, via the :unhandled error key.",
   :var-type "macro",
   :line 39,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj"}
  {:arglists ([& forms]),
   :name "with-handler",
   :namespace "clojure.contrib.error-kit",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj#L163",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/with-handler",
   :doc
   "This is error-kit's dynamic scope form.  The body will be executed\nin a dynamic context that includes all of the following 'handle' and\n'bind-continue' forms.",
   :var-type "macro",
   :line 163,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/error-kit/src/main/clojure/clojure/contrib/error_kit.clj"}
  {:arglists ([& args]),
   :name "throw-arg",
   :namespace "clojure.contrib.except",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/except/src/main/clojure/clojure/contrib/except.clj#L57",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/except/src/main/clojure/clojure/contrib/except.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//except-api.html#clojure.contrib.except/throw-arg",
   :doc
   "Throws an IllegalArgumentException. All arguments are optional:\n\n      cause? format? format-args*\n\n- cause defaults to nil, if present it must be a Throwable\n- format is a format string for clojure.core/format\n- format-args are objects that correspond to format specifiers in\n  format.",
   :var-type "function",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/except/src/main/clojure/clojure/contrib/except.clj"}
  {:arglists ([test & args]),
   :name "throw-if",
   :namespace "clojure.contrib.except",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/except/src/main/clojure/clojure/contrib/except.clj#L43",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/except/src/main/clojure/clojure/contrib/except.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//except-api.html#clojure.contrib.except/throw-if",
   :doc
   "Throws an Exception or Error if test is true. args are those documented\nfor throwf.",
   :var-type "function",
   :line 43,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/except/src/main/clojure/clojure/contrib/except.clj"}
  {:arglists ([test & args]),
   :name "throw-if-not",
   :namespace "clojure.contrib.except",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/except/src/main/clojure/clojure/contrib/except.clj#L50",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/except/src/main/clojure/clojure/contrib/except.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//except-api.html#clojure.contrib.except/throw-if-not",
   :doc
   "Throws an Exception or Error if test is false. args are those documented\nfor throwf.",
   :var-type "function",
   :line 50,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/except/src/main/clojure/clojure/contrib/except.clj"}
  {:arglists ([& args]),
   :name "throwf",
   :namespace "clojure.contrib.except",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/except/src/main/clojure/clojure/contrib/except.clj#L28",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/except/src/main/clojure/clojure/contrib/except.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//except-api.html#clojure.contrib.except/throwf",
   :doc
   "Throws an Exception or Error with an optional message formatted using\nclojure.core/format. All arguments are optional:\n\n    class? cause? format? format-args*\n\n- class defaults to Exception, if present it must name a kind of\n  Throwable\n- cause defaults to nil, if present it must be a Throwable\n- format is a format string for clojure.core/format\n- format-args are objects that correspond to format specifiers in\n  format.",
   :var-type "function",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/except/src/main/clojure/clojure/contrib/except.clj"}
  {:arglists ([test-value & clauses]),
   :name "case",
   :namespace "clojure.contrib.fcase",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/fcase.clj#L79",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/fcase.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//fcase-api.html#clojure.contrib.fcase/case",
   :doc
   "Like cond, but test-value is compared against the value of each\ntest expression with =.  If they are equal, executes the \"body\"\nexpression.  Optional last expression is executed if none of the\ntest expressions match.",
   :var-type "macro",
   :line 79,
   :file "clojure/contrib/fcase.clj"}
  {:arglists ([compare-fn case-value & test-expr-clauses]),
   :name "fcase",
   :namespace "clojure.contrib.fcase",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/fcase.clj#L40",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/fcase.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//fcase-api.html#clojure.contrib.fcase/fcase",
   :doc
   "Generic switch/case macro.  'fcase' is short for 'function case'.\n\nThe 'compare-fn' is a fn of two arguments.\n\nThe 'test-expr-clauses' are value-expression pairs without\nsurrounding parentheses, like in Clojure's 'cond'.\n\nThe 'case-value' is evaluated once and cached.  Then, 'compare-fn'\nis called once for each clause, with the clause's test value as its\nfirst argument and 'case-value' as its second argument.  If\n'compare-fn' returns logical true, the clause's expression is\nevaluated and returned.  If 'compare-fn' returns false/nil, we go to\nthe next test value.\n\nIf 'test-expr-clauses' contains an odd number of items, the last\nitem is the default expression evaluated if no case-value matches.\nIf there is no default expression and no case-value matches, fcase\nreturns nil.\n\nSee specific forms of this macro in 'case' and 're-case'.\n\nThe test expressions in 'fcase' are always evaluated linearly, in\norder.  For a large number of case expressions it may be more\nefficient to use a hash lookup.",
   :var-type "macro",
   :line 40,
   :file "clojure/contrib/fcase.clj"}
  {:arglists ([test-value & clauses]),
   :name "in-case",
   :namespace "clojure.contrib.fcase",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/fcase.clj#L103",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/fcase.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//fcase-api.html#clojure.contrib.fcase/in-case",
   :doc
   "Like case, but test expressions are sequences.  The test expression\nis true if any item in the sequence is equal (tested with '=') to\nthe test value.",
   :var-type "macro",
   :line 103,
   :file "clojure/contrib/fcase.clj"}
  {:arglists ([test-value & clauses]),
   :name "instance-case",
   :namespace "clojure.contrib.fcase",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/fcase.clj#L93",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/fcase.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//fcase-api.html#clojure.contrib.fcase/instance-case",
   :doc
   "Like case, but the test expressions are Java class names, tested with\n'instance?'.",
   :var-type "macro",
   :line 93,
   :file "clojure/contrib/fcase.clj"}
  {:arglists ([test-value & clauses]),
   :name "re-case",
   :namespace "clojure.contrib.fcase",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/fcase.clj#L87",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/fcase.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//fcase-api.html#clojure.contrib.fcase/re-case",
   :doc
   "Like case, but the test expressions are regular expressions, tested\nwith re-find.",
   :var-type "macro",
   :line 87,
   :file "clojure/contrib/fcase.clj"}
  {:arglists ([file]),
   :name "clojure-source-file?",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L28",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/clojure-source-file?",
   :doc "Returns true if file is a normal file with a .clj extension.",
   :var-type "function",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([jar-file]),
   :name "clojure-sources-in-jar",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L88",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/clojure-sources-in-jar",
   :doc
   "Returns a sequence of filenames ending in .clj found in the JAR file.",
   :var-type "function",
   :line 88,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([form]),
   :name "comment?",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L42",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/comment?",
   :doc "Returns true if form is a (comment ...)",
   :var-type "function",
   :line 42,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([dir]),
   :name "find-clojure-sources-in-dir",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L34",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-clojure-sources-in-dir",
   :doc
   "Searches recursively under dir for Clojure source files (.clj).\nReturns a sequence of File objects, in breadth-first sort order.",
   :var-type "function",
   :line 34,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([dir]),
   :name "find-namespaces-in-dir",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L79",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-namespaces-in-dir",
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the symbol names of the declared namespaces.",
   :var-type "function",
   :line 79,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([jarfile]),
   :name "find-namespaces-in-jarfile",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L112",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-namespaces-in-jarfile",
   :doc
   "Searches the JAR file for Clojure source files containing (ns ...)\ndeclarations.  Returns a sequence of the symbol names of the\ndeclared namespaces.",
   :var-type "function",
   :line 112,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([]),
   :name "find-namespaces-on-classpath",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L131",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-namespaces-on-classpath",
   :doc
   "Searches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations.  Returns a sequence\nof the symbol names of the declared namespaces.",
   :var-type "function",
   :line 131,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([dir]),
   :name "find-ns-decls-in-dir",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L73",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-ns-decls-in-dir",
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 73,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([jarfile]),
   :name "find-ns-decls-in-jarfile",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L104",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-ns-decls-in-jarfile",
   :doc
   "Searches the JAR file for Clojure source files containing (ns ...)\ndeclarations; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 104,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([]),
   :name "find-ns-decls-on-classpath",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L122",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-ns-decls-on-classpath",
   :doc
   "Searches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations.  Returns a sequence\nof the unevaluated ns declaration forms.",
   :var-type "function",
   :line 122,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([form]),
   :name "ns-decl?",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L47",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/ns-decl?",
   :doc "Returns true if form is a (ns ...) declaration.",
   :var-type "function",
   :line 47,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([file]),
   :name "read-file-ns-decl",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L65",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/read-file-ns-decl",
   :doc
   "Attempts to read a (ns ...) declaration from file, and returns the\nunevaluated form.  Returns nil if read fails, or if the first form\nis not a ns declaration.",
   :var-type "function",
   :line 65,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([rdr]),
   :name "read-ns-decl",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L52",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/read-ns-decl",
   :doc
   "Attempts to read a (ns ...) declaration from rdr, and returns the\nunevaluated form.  Returns nil if read fails or if a ns declaration\ncannot be found.  The ns declaration must be the first Clojure form\nin the file, except for (comment ...)  forms.",
   :var-type "function",
   :line 52,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([jarfile entry-name]),
   :name "read-ns-decl-from-jarfile-entry",
   :namespace "clojure.contrib.find-namespaces",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj#L93",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/read-ns-decl-from-jarfile-entry",
   :doc
   "Attempts to read a (ns ...) declaration from the named entry in the\nJAR file, and returns the unevaluated form.  Returns nil if the read\nfails, or if the first form is not a ns declaration.",
   :var-type "function",
   :line 93,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/find-namespaces/src/main/clojure/clojure/contrib/find_namespaces.clj"}
  {:arglists ([getter setter] [getter setter & keyvals]),
   :name "fnmap",
   :namespace "clojure.contrib.fnmap",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/fnmap/src/main/clojure/clojure/contrib/fnmap.clj#L19",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/fnmap/src/main/clojure/clojure/contrib/fnmap.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//fnmap-api.html#clojure.contrib.fnmap/fnmap",
   :doc
   "Creates a fnmap, or functional map.  A fnmap behaves like an\nordinary Clojure map, except that calls to get and assoc are\nfiltered through user-defined getter and setter functions, which\noperate on an internal map.\n\n(getter m key) should return a value for key.\n\n(setter m key value) should assoc key with value and return a new\nmap for m.\n\nAll other map operations are passed through to the internal map.",
   :var-type "function",
   :line 19,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/fnmap/src/main/clojure/clojure/contrib/fnmap.clj"}
  {:arglists ([libs]),
   :name "generate-documentation",
   :namespace "clojure.contrib.gen-html-docs",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/67e85be147095c87a3cec82a64455974f29c7fd7/modules/gen-html-docs/src/main/clojure/clojure/contrib/gen_html_docs.clj#L427",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/67e85be147095c87a3cec82a64455974f29c7fd7/modules/gen-html-docs/src/main/clojure/clojure/contrib/gen_html_docs.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//gen-html-docs-api.html#clojure.contrib.gen-html-docs/generate-documentation",
   :doc
   "Returns a string which is the HTML documentation for the libraries\nnamed by libs. Libs is a vector of symbols identifying Clojure\nlibraries.",
   :var-type "function",
   :line 427,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/gen-html-docs/src/main/clojure/clojure/contrib/gen_html_docs.clj"}
  {:arglists ([path libs]),
   :name "generate-documentation-to-file",
   :namespace "clojure.contrib.gen-html-docs",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/67e85be147095c87a3cec82a64455974f29c7fd7/modules/gen-html-docs/src/main/clojure/clojure/contrib/gen_html_docs.clj#L453",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/67e85be147095c87a3cec82a64455974f29c7fd7/modules/gen-html-docs/src/main/clojure/clojure/contrib/gen_html_docs.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//gen-html-docs-api.html#clojure.contrib.gen-html-docs/generate-documentation-to-file",
   :doc
   "Calls generate-documentation on the libraries named by libs and\nemits the generated HTML to the path named by path.",
   :var-type "function",
   :line 453,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/gen-html-docs/src/main/clojure/clojure/contrib/gen_html_docs.clj"}
  {:arglists ([ns name & args]),
   :name "defmethod*",
   :namespace "clojure.contrib.generic.arithmetic",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/generic/src/main/clojure/clojure/contrib/generic/arithmetic.clj#L173",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/generic/src/main/clojure/clojure/contrib/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.arithmetic-api.html#clojure.contrib.generic.arithmetic/defmethod*",
   :doc
   "Define a method implementation for the multimethod name in namespace ns.\nRequired for implementing the division function from another namespace.",
   :var-type "macro",
   :line 173,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/generic/src/main/clojure/clojure/contrib/generic/arithmetic.clj"}
  {:arglists ([ns sym]),
   :name "qsym",
   :namespace "clojure.contrib.generic.arithmetic",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/generic/src/main/clojure/clojure/contrib/generic/arithmetic.clj#L180",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/generic/src/main/clojure/clojure/contrib/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.arithmetic-api.html#clojure.contrib.generic.arithmetic/qsym",
   :doc
   "Create the qualified symbol corresponding to sym in namespace ns.\nRequired to access the division function from another namespace,\ne.g. as (qsym clojure.contrib.generic.arithmetic /).",
   :var-type "macro",
   :line 180,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/generic/src/main/clojure/clojure/contrib/generic/arithmetic.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "max",
   :namespace "clojure.contrib.generic.comparison",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/generic/src/main/clojure/clojure/contrib/generic/comparison.clj#L200",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/generic/src/main/clojure/clojure/contrib/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.comparison-api.html#clojure.contrib.generic.comparison/max",
   :doc
   "Returns the greatest of its arguments. Like clojure.core/max except that\nis uses generic comparison functions implementable for any data type.",
   :var-type "function",
   :line 200,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/generic/src/main/clojure/clojure/contrib/generic/comparison.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "min",
   :namespace "clojure.contrib.generic.comparison",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/generic/src/main/clojure/clojure/contrib/generic/comparison.clj#L208",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/generic/src/main/clojure/clojure/contrib/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.comparison-api.html#clojure.contrib.generic.comparison/min",
   :doc
   "Returns the least of its arguments. Like clojure.core/min except that\nis uses generic comparison functions implementable for any data type.",
   :var-type "function",
   :line 208,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/generic/src/main/clojure/clojure/contrib/generic/comparison.clj"}
  {:arglists ([x y eps]),
   :name "approx=",
   :namespace "clojure.contrib.generic.math-functions",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/generic/src/main/clojure/clojure/contrib/generic/math_functions.clj#L110",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/generic/src/main/clojure/clojure/contrib/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/approx=",
   :doc
   "Return true if the absolute value of the difference between x and y\nis less than eps.",
   :var-type "function",
   :line 110,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/generic/src/main/clojure/clojure/contrib/generic/math_functions.clj"}
  {:arglists ([g]),
   :name "add-loops",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L49",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/add-loops",
   :doc "For each node n, add the edge n->n if not already present.",
   :var-type "function",
   :line 49,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([g] [g sccs]),
   :name "component-graph",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L133",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/component-graph",
   :doc
   "Given a graph, perhaps with cycles, return a reduced graph that is acyclic.\nEach node in the new graph will be a set of nodes from the old.\nThese sets are the strongly connected components.  Each edge will\nbe the union of the corresponding edges of the prior graph.",
   :var-type "function",
   :line 133,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([g]),
   :name "dependency-list",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L190",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/dependency-list",
   :doc
   "Similar to a topological sort, this returns a vector of sets. The\nset of nodes at index 0 are independent.  The set at index 1 depend\non index 0; those at 2 depend on 0 and 1, and so on.  Those withing\na set have no mutual dependencies.  Assume the input graph (which\nmuch be acyclic) has an edge a->b when a depends on b.",
   :var-type "function",
   :line 190,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([data fun max equal]),
   :name "fixed-point",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L167",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/fixed-point",
   :doc
   "Repeatedly apply fun to data until (equal old-data new-data)\nreturns true.  If max iterations occur, it will throw an\nexception.  Set max to nil for unlimited iterations.",
   :var-type "function",
   :line 167,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([g n]),
   :name "get-neighbors",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L29",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/get-neighbors",
   :doc "Get the neighbors of a node.",
   :var-type "function",
   :line 29,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([g n] [g ns v]),
   :name "lazy-walk",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L68",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/lazy-walk",
   :doc
   "Return a lazy sequence of the nodes of a graph starting a node n.  Optionally,\nprovide a set of visited notes (v) and a collection of nodes to\nvisit (ns).",
   :var-type "function",
   :line 68,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([g]),
   :name "post-ordered-nodes",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L110",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/post-ordered-nodes",
   :doc
   "Return a sequence of indexes of a post-ordered walk of the graph.",
   :var-type "function",
   :line 110,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([g ns]),
   :name "recursive-component?",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L151",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/recursive-component?",
   :doc "Is the component (recieved from scc) self recursive?",
   :var-type "function",
   :line 151,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([g]),
   :name "remove-loops",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L57",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/remove-loops",
   :doc "For each node n, remove any edges n->n.",
   :var-type "function",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([g]),
   :name "reverse-graph",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L37",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/reverse-graph",
   :doc
   "Given a directed graph, return another directed graph with the\norder of the edges reversed.",
   :var-type "function",
   :line 37,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([g]),
   :name "scc",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L117",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/scc",
   :doc
   "Returns, as a sequence of sets, the strongly connected components\nof g.",
   :var-type "function",
   :line 117,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([g]),
   :name "self-recursive-sets",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L158",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/self-recursive-sets",
   :doc
   "Returns, as a sequence of sets, the components of a graph that are\nself-recursive.",
   :var-type "function",
   :line 158,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([g1 g2]),
   :name "stratification-list",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L207",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/stratification-list",
   :doc
   "Similar to dependency-list (see doc), except two graphs are\nprovided.  The first is as dependency-list.  The second (which may\nhave cycles) provides a partial-dependency relation.  If node a\ndepends on node b (meaning an edge a->b exists) in the second\ngraph, node a must be equal or later in the sequence.",
   :var-type "function",
   :line 207,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([g]),
   :name "transitive-closure",
   :namespace "clojure.contrib.graph",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj#L81",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/graph/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/transitive-closure",
   :doc
   "Returns the transitive closure of a graph.  The neighbors are lazily computed.\n\nNote: some version of this algorithm return all edges a->a\nregardless of whether such loops exist in the original graph.  This\nversion does not.  Loops will be included only if produced by\ncycles in the graph.  If you have code that depends on such\nbehavior, call (-> g transitive-closure add-loops)",
   :var-type "function",
   :line 81,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/graph/src/main/clojure/clojure/contrib/graph.clj"}
  {:arglists ([& args]),
   :name "all-greatest",
   :namespace "clojure.contrib.greatest-least",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj#L52",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/all-greatest",
   :doc "Returns all the greatest elements.",
   :var-type "function",
   :line 52,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj"}
  {:arglists ([f & args]),
   :name "all-greatest-by",
   :namespace "clojure.contrib.greatest-least",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj#L47",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/all-greatest-by",
   :doc
   "Return all the elements for which f yields the greatest value.",
   :var-type "function",
   :line 47,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj"}
  {:arglists ([& args]),
   :name "all-least",
   :namespace "clojure.contrib.greatest-least",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj#L62",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/all-least",
   :doc "Returns all the least elements.",
   :var-type "function",
   :line 62,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj"}
  {:arglists ([f & args]),
   :name "all-least-by",
   :namespace "clojure.contrib.greatest-least",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj#L57",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/all-least-by",
   :doc "Return all the elements for which f yields the least value.",
   :var-type "function",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj"}
  {:arglists ([& args]),
   :name "greatest",
   :namespace "clojure.contrib.greatest-least",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj#L18",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/greatest",
   :doc "Return the greatest argument.",
   :var-type "function",
   :line 18,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj"}
  {:arglists ([f & args]),
   :name "greatest-by",
   :namespace "clojure.contrib.greatest-least",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj#L13",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/greatest-by",
   :doc "Return the argument for which f yields the greatest value.",
   :var-type "function",
   :line 13,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj"}
  {:arglists ([& args]),
   :name "least",
   :namespace "clojure.contrib.greatest-least",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj#L28",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/least",
   :doc "Return the smallest element.",
   :var-type "function",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj"}
  {:arglists ([f & args]),
   :name "least-by",
   :namespace "clojure.contrib.greatest-least",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj#L23",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/least-by",
   :doc "Return the argument for which f yields the smallest value.",
   :var-type "function",
   :line 23,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/greatest-least/src/main/clojure/clojure/contrib/greatest_least.clj"}
  {:arglists ([class & fields-and-methods]),
   :name "import-static",
   :namespace "clojure.contrib.import-static",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/import-static/src/main/clojure/clojure/contrib/import_static.clj#L22",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/import-static/src/main/clojure/clojure/contrib/import_static.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//import-static-api.html#clojure.contrib.import-static/import-static",
   :doc
   "Imports the named static fields and/or static methods of the class\nas (private) symbols in the current namespace.\n\nExample: \n    user=> (import-static java.lang.Math PI sqrt)\n    nil\n    user=> PI\n    3.141592653589793\n    user=> (sqrt 16)\n    4.0\n\nNote: The class name must be fully qualified, even if it has already\nbeen imported.  Static methods are defined as MACROS, not\nfirst-class fns.",
   :var-type "macro",
   :line 22,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/import-static/src/main/clojure/clojure/contrib/import_static.clj"}
  {:arglists ([jar-file]),
   :name "filenames-in-jar",
   :namespace "clojure.contrib.jar",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/jar/src/main/clojure/clojure/contrib/jar.clj#L29",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/jar/src/main/clojure/clojure/contrib/jar.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jar-api.html#clojure.contrib.jar/filenames-in-jar",
   :doc
   "Returns a sequence of Strings naming the non-directory entries in\nthe JAR file.",
   :var-type "function",
   :line 29,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jar/src/main/clojure/clojure/contrib/jar.clj"}
  {:arglists ([file]),
   :name "jar-file?",
   :namespace "clojure.contrib.jar",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/jar/src/main/clojure/clojure/contrib/jar.clj#L22",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/jar/src/main/clojure/clojure/contrib/jar.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jar-api.html#clojure.contrib.jar/jar-file?",
   :doc
   "Returns true if file is a normal file with a .jar or .JAR extension.",
   :var-type "function",
   :line 22,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jar/src/main/clojure/clojure/contrib/jar.clj"}
  {:arglists ([m]),
   :name "as-properties",
   :namespace "clojure.contrib.java-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/60e7162a5a29615cae3e6d494a3653c34b6ddb66/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj#L85",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/60e7162a5a29615cae3e6d494a3653c34b6ddb66/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/as-properties",
   :doc
   "Convert any seq of pairs to a java.utils.Properties instance.\nUses name to convert both keys and values into strings.",
   :var-type "function",
   :line 85,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj"}
  {:arglists ([stringable] [stringable default]),
   :name "get-system-property",
   :namespace "clojure.contrib.java-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/60e7162a5a29615cae3e6d494a3653c34b6ddb66/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj#L50",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/60e7162a5a29615cae3e6d494a3653c34b6ddb66/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/get-system-property",
   :doc "Get a system property.",
   :var-type "function",
   :line 50,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj"}
  {:arglists ([file-able]),
   :name "read-properties",
   :namespace "clojure.contrib.java-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/60e7162a5a29615cae3e6d494a3653c34b6ddb66/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj#L95",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/60e7162a5a29615cae3e6d494a3653c34b6ddb66/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/read-properties",
   :doc "Read properties from file-able.",
   :var-type "function",
   :line 95,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj"}
  {:arglists ([settings]),
   :name "set-system-properties",
   :namespace "clojure.contrib.java-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/60e7162a5a29615cae3e6d494a3653c34b6ddb66/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj#L57",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/60e7162a5a29615cae3e6d494a3653c34b6ddb66/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/set-system-properties",
   :doc "Set some system properties. Nil clears a property.",
   :var-type "function",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj"}
  {:arglists ([settings & body]),
   :name "with-system-properties",
   :namespace "clojure.contrib.java-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/60e7162a5a29615cae3e6d494a3653c34b6ddb66/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj#L65",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/60e7162a5a29615cae3e6d494a3653c34b6ddb66/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/with-system-properties",
   :doc
   "setting => property-name value\n\nSets the system properties to the supplied values, executes the body, and\nsets the properties back to their original values. Values of nil are\ntranslated to a clearing of the property.",
   :var-type "macro",
   :line 65,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj"}
  {:arglists ([m file-able] [m file-able comments]),
   :name "write-properties",
   :namespace "clojure.contrib.java-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/60e7162a5a29615cae3e6d494a3653c34b6ddb66/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj#L102",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/60e7162a5a29615cae3e6d494a3653c34b6ddb66/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/write-properties",
   :doc "Write properties to file-able.",
   :var-type "function",
   :line 102,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/java-utils/src/main/clojure/clojure/contrib/java_utils.clj"}
  {:name "*connection*",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj#L82",
   :dynamic true,
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/*connection*",
   :doc
   "The connection to be used for JMX ops. Defaults to the local process.",
   :var-type "var",
   :line 82,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj"}
  {:arglists ([object-name attr-name]),
   :name "attribute-info",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj#L60",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/attribute-info",
   :doc "Get the MBeanAttributeInfo for an attribute.",
   :var-type "function",
   :line 60,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj"}
  {:arglists ([n]),
   :name "attribute-names",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj#L100",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/attribute-names",
   :doc "All attribute names available on an MBean.",
   :var-type "function",
   :line 100,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj"}
  {:arglists
   ([attr-name attr-value] [name type desc readable? writable? is?]),
   :name "build-attribute-info",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj#L91",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/build-attribute-info",
   :doc
   "Construct an MBeanAttributeInfo. Normally called with a key/value pair from a Clojure map.",
   :var-type "function",
   :line 91,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj"}
  {:arglists ([value]),
   :name "guess-attribute-typename",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj#L85",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/guess-attribute-typename",
   :doc
   "Guess the attribute typename for MBeanAttributeInfo based on the attribute value.",
   :var-type "function",
   :line 85,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj"}
  {:arglists ([] [overrides]),
   :name "jmx-url",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj#L19",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/jmx-url",
   :doc "Build a JMX URL from options.",
   :var-type "function",
   :line 19,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj"}
  {:arglists ([attr-map]),
   :name "map->attribute-infos",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj#L100",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/map->attribute-infos",
   :doc
   "Construct an MBeanAttributeInfo[] from a Clojure associative.",
   :var-type "function",
   :line 100,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj"}
  {:arglists ([k]),
   :name "maybe-atomize",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj#L44",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/maybe-atomize",
   :doc
   "Convert a list of length 1 into its contents, leaving other things alone.\nUsed to simplify keys in the tabular data API.",
   :var-type "function",
   :line 44,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj"}
  {:arglists ([s]),
   :name "maybe-keywordize",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj#L38",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/maybe-keywordize",
   :doc
   "Convert a string key to a keyword, leaving other types alone. Used to\nsimplify keys in the tabular data API.",
   :var-type "function",
   :line 38,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/data.clj"}
  {:arglists ([n]),
   :name "mbean",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj#L119",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/mbean",
   :doc
   "Like clojure.core/bean, but for JMX beans. Returns a read-only map of\na JMX bean's attributes. If an attribute it not supported, value is\nset to the exception thrown.",
   :var-type "function",
   :line 119,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj"}
  {:arglists ([n]),
   :name "mbean-names",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj#L95",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/mbean-names",
   :doc
   "Finds all MBeans matching a name on the current *connection*.",
   :var-type "function",
   :line 95,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj"}
  {:arglists ([n op]),
   :name "op-param-types",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj#L81",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/op-param-types",
   :doc
   "The parameter types (as class name strings) for operation op on n.\nUsed for invoke.",
   :var-type "function",
   :line 81,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj"}
  {:arglists ([n op]),
   :name "operation",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj#L76",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/operation",
   :doc
   "The MBeanOperationInfo for operation op on mbean n. Used by invoke.",
   :var-type "function",
   :line 76,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj"}
  {:arglists ([n]),
   :name "operation-names",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj#L106",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/operation-names",
   :doc "All operation names available on an MBean.",
   :var-type "function",
   :line 106,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx.clj"}
  {:arglists ([n]),
   :name "operations",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj#L71",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/operations",
   :doc "All oeprations available on an MBean.",
   :var-type "function",
   :line 71,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj"}
  {:arglists ([n attr]),
   :name "raw-read",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj#L33",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/raw-read",
   :doc
   "Read an mbean property. Returns low-level Java object model for\ncomposites, tabulars, etc. Most callers should use read.",
   :var-type "function",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj#L39",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/read",
   :namespace "clojure.contrib.jmx",
   :line 39,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj",
   :var-type "var",
   :doc "Read an mbean property.",
   :name "read"}
  {:arglists ([n attr]),
   :name "read-supported",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj#L43",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/read-supported",
   :doc
   "Calls read to read an mbean property, *returning* unsupported\noperation exceptions instead of throwing them. Used to keep mbean\nfrom blowing up. Note: There is no good exception that aggregates\nunsupported operations, hence the overly-general catch block.",
   :var-type "function",
   :line 43,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj"}
  {:arglists ([n attr]),
   :name "readable?",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj#L66",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/readable?",
   :doc "Is attribute readable?",
   :var-type "function",
   :line 66,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj"}
  {:arglists ([opts & body]),
   :name "with-connection",
   :namespace "clojure.contrib.jmx",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj#L17",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fd185b68492657dcb6b1d15ef18fc67becf8450c/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/with-connection",
   :doc
   "Execute body with JMX connection specified by opts. opts can also\ninclude an optional :environment key which is passed as the\nenvironment arg to JMXConnectorFactory/connect.",
   :var-type "macro",
   :line 17,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/jmx/src/main/clojure/clojure/contrib/jmx/client.clj"}
  {:arglists ([x & options]),
   :name "json-str",
   :namespace "clojure.contrib.json",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/01036ea181b979b5ff190f2eb44c2bf3ca9e1c3b/modules/json/src/main/clojure/clojure/contrib/json.clj#L305",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/01036ea181b979b5ff190f2eb44c2bf3ca9e1c3b/modules/json/src/main/clojure/clojure/contrib/json.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//json-api.html#clojure.contrib.json/json-str",
   :doc
   "Converts x to a JSON-formatted string.\n\nValid options are:\n  :escape-unicode false\n      to turn of \\uXXXX escapes of Unicode characters.",
   :var-type "function",
   :line 305,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/json/src/main/clojure/clojure/contrib/json.clj"}
  {:arglists ([x & options]),
   :name "pprint-json",
   :namespace "clojure.contrib.json",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/01036ea181b979b5ff190f2eb44c2bf3ca9e1c3b/modules/json/src/main/clojure/clojure/contrib/json.clj#L352",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/01036ea181b979b5ff190f2eb44c2bf3ca9e1c3b/modules/json/src/main/clojure/clojure/contrib/json.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//json-api.html#clojure.contrib.json/pprint-json",
   :doc
   "Pretty-prints JSON representation of x to *out*.\n\nValid options are:\n  :escape-unicode false\n      to turn off \\uXXXX escapes of Unicode characters.",
   :var-type "function",
   :line 352,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/json/src/main/clojure/clojure/contrib/json.clj"}
  {:arglists ([x & options]),
   :name "print-json",
   :namespace "clojure.contrib.json",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/01036ea181b979b5ff190f2eb44c2bf3ca9e1c3b/modules/json/src/main/clojure/clojure/contrib/json.clj#L318",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/01036ea181b979b5ff190f2eb44c2bf3ca9e1c3b/modules/json/src/main/clojure/clojure/contrib/json.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//json-api.html#clojure.contrib.json/print-json",
   :doc
   "Write JSON-formatted output to *out*.\n\nValid options are:\n  :escape-unicode false\n      to turn off \\uXXXX escapes of Unicode characters.",
   :var-type "function",
   :line 318,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/json/src/main/clojure/clojure/contrib/json.clj"}
  {:arglists
   ([input]
    [input keywordize?]
    [input keywordize? eof-error? eof-value]),
   :name "read-json",
   :namespace "clojure.contrib.json",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/01036ea181b979b5ff190f2eb44c2bf3ca9e1c3b/modules/json/src/main/clojure/clojure/contrib/json.clj#L186",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/01036ea181b979b5ff190f2eb44c2bf3ca9e1c3b/modules/json/src/main/clojure/clojure/contrib/json.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//json-api.html#clojure.contrib.json/read-json",
   :doc
   "Reads one JSON value from input String or Reader.\nIf keywordize? is true (default), object keys will be converted to\nkeywords.  If eof-error? is true (default), empty input will throw\nan EOFException; if false EOF will return eof-value. ",
   :var-type "function",
   :line 186,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/json/src/main/clojure/clojure/contrib/json.clj"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure-contrib//json-api.html#clojure.contrib.json/read-json-from",
   :namespace "clojure.contrib.json",
   :var-type "function",
   :arglists ([input keywordize? eof-error? eof-value]),
   :doc
   "Reads one JSON value from input String or Reader.\nIf keywordize? is true, object keys will be converted to keywords.\nIf eof-error? is true, empty input will throw an EOFException; if\nfalse EOF will return eof-value. ",
   :name "read-json-from"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure-contrib//json-api.html#clojure.contrib.json/write-json",
   :namespace "clojure.contrib.json",
   :var-type "function",
   :arglists ([object out escape-unicode?]),
   :doc "Print object to PrintWriter out as JSON",
   :name "write-json"}
  {:arglists ([]),
   :name "fibs",
   :namespace "clojure.contrib.lazy-seqs",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/lazy-seqs/src/main/clojure/clojure/contrib/lazy_seqs.clj#L82",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/lazy-seqs/src/main/clojure/clojure/contrib/lazy_seqs.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//lazy-seqs-api.html#clojure.contrib.lazy-seqs/fibs",
   :doc "Returns a lazy sequence of all the Fibonacci numbers.",
   :var-type "function",
   :line 82,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/lazy-seqs/src/main/clojure/clojure/contrib/lazy_seqs.clj"}
  {:arglists ([]),
   :name "powers-of-2",
   :namespace "clojure.contrib.lazy-seqs",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/lazy-seqs/src/main/clojure/clojure/contrib/lazy_seqs.clj#L87",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/lazy-seqs/src/main/clojure/clojure/contrib/lazy_seqs.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//lazy-seqs-api.html#clojure.contrib.lazy-seqs/powers-of-2",
   :doc "Returns a lazy sequence of all the powers of 2",
   :var-type "function",
   :line 87,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/lazy-seqs/src/main/clojure/clojure/contrib/lazy_seqs.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/lazy-seqs/src/main/clojure/clojure/contrib/lazy_seqs.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/lazy-seqs/src/main/clojure/clojure/contrib/lazy_seqs.clj#L66",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//lazy-seqs-api.html#clojure.contrib.lazy-seqs/primes",
   :namespace "clojure.contrib.lazy-seqs",
   :line 66,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/lazy-seqs/src/main/clojure/clojure/contrib/lazy_seqs.clj",
   :var-type "var",
   :doc "Lazy sequence of all the prime numbers.",
   :name "primes"}
  {:arglists ([s] [s startparse] [s startparse queue-size]),
   :name "parse-seq",
   :namespace "clojure.contrib.lazy-xml",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/lazy-xml/src/main/clojure/clojure/contrib/lazy_xml.clj#L38",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/lazy-xml/src/main/clojure/clojure/contrib/lazy_xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//lazy-xml-api.html#clojure.contrib.lazy-xml/parse-seq",
   :doc
   "Parses the source s, which can be a File, InputStream or String\nnaming a URI. Returns a lazy sequence of maps with two or more of\nthe keys :type, :name, :attrs, and :str. Other SAX-compatible\nparsers can be supplied by passing startparse, a fn taking a source\nand a ContentHandler and returning a parser. If a parser is\nspecified, it will be run in a separate thread and be allowed to get\nahead by queue-size items, which defaults to maxint.  If no parser\nis specified and org.xmlpull.v1.XmlPullParser is in the classpath,\nthis superior pull parser will be used.",
   :var-type "function",
   :line 38,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/lazy-xml/src/main/clojure/clojure/contrib/lazy_xml.clj"}
  {:arglists ([s] [s startparse queue-size]),
   :name "parse-trim",
   :namespace "clojure.contrib.lazy-xml",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/lazy-xml/src/main/clojure/clojure/contrib/lazy_xml.clj#L95",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/lazy-xml/src/main/clojure/clojure/contrib/lazy_xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//lazy-xml-api.html#clojure.contrib.lazy-xml/parse-trim",
   :doc
   "Parses the source s, which can be a File, InputStream or String\nnaming a URI. Returns a lazy tree of the clojure.xml/element\nstruct-map, which has the keys :tag, :attrs, and :content and\naccessor fns tag, attrs, and content, with the whitespace trimmed\nfrom around each content string. This format is compatible with what\nclojure.xml/parse produces, except :content is a lazy seq instead of\na vector.  Other SAX-compatible parsers can be supplied by passing\nstartparse, a fn taking a source and a ContentHandler and returning\na parser. If a parser is specified, it will be run in a separate\nthread and be allowed to get ahead by queue-size items, which\ndefaults to maxing.  If no parser is specified and\norg.xmlpull.v1.XmlPullParser is in the classpath, this superior pull\nparser will be used.",
   :var-type "function",
   :line 95,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/lazy-xml/src/main/clojure/clojure/contrib/lazy_xml.clj"}
  {:name "*force*",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L94",
   :dynamic true,
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/*force*",
   :doc
   "Overrides the default rules for choosing between logging directly or via an\nagent. Defaults to nil. See log* for details.",
   :var-type "var",
   :line 94,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:name "*log-factory*",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L488",
   :dynamic true,
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/*log-factory*",
   :doc
   "An instance satisfying the LogFactory protocol. Used internally when needing\nto obtain an instance satisfying the Log protocol. Defaults to the value\nreturned from find-factory. Can be rebound to provide alternate logging\nimplementations",
   :var-type "var",
   :line 488,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:name "*logging-agent*",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L84",
   :dynamic true,
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/*logging-agent*",
   :doc
   "The default agent used for performing logging when direct logging is\ndisabled. See log* for details.",
   :var-type "var",
   :line 84,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:name "*tx-agent-levels*",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L89",
   :dynamic true,
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/*tx-agent-levels*",
   :doc
   "The set of levels that will require using an agent when logging from within a\nrunning transaction. Defaults to #{:info :warn}. See log* for details.",
   :var-type "var",
   :line 89,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L62",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/Log",
   :namespace "clojure.contrib.logging",
   :line 62,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "var",
   :doc
   "The protocol through which macros will interact with an underlying logging\nimplementation.  Implementations should at least support the six specified\nlogging levels if they wish to benefit from the level-specific macros.",
   :name "Log"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L73",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/LogFactory",
   :namespace "clojure.contrib.logging",
   :line 73,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "var",
   :doc
   "The protocol through which macros will obtain an instance satisfying Log as\nwell as providing information about the particular implementation being used.\nImplementations should be bound to *log-factory* in order to be picked up by\nthis library.",
   :name "LogFactory"}
  {:arglists ([]),
   :name "commons-logging",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L334",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/commons-logging",
   :doc
   "Returns a commons-logging-based implementation of the LogFactory protocol, or\nnil if not available. End-users should not need to call this.",
   :var-type "function",
   :line 334,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([message & more] [throwable message & more]),
   :name "debug",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L265",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/debug",
   :doc "Debug level logging using print-style args.",
   :var-type "macro",
   :line 265,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([fmt & fmt-args] [throwable fmt & fmt-args]),
   :name "debugf",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L301",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/debugf",
   :doc "Debug level logging using format.",
   :var-type "macro",
   :line 301,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([level] [level log-ns]),
   :name "enabled?",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L164",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/enabled?",
   :doc
   "Returns true if the specific logging level is enabled.  Use of this function\nshould only be necessary if one needs to execute alternate code paths beyond\nwhether the log should be written to.",
   :var-type "macro",
   :line 164,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([message & more] [throwable message & more]),
   :name "error",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L283",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/error",
   :doc "Error level logging using print-style args.",
   :var-type "macro",
   :line 283,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([fmt & fmt-args] [throwable fmt & fmt-args]),
   :name "errorf",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L319",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/errorf",
   :doc "Error level logging using format.",
   :var-type "macro",
   :line 319,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([message & more] [throwable message & more]),
   :name "fatal",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L289",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/fatal",
   :doc "Fatal level logging using print-style args.",
   :var-type "macro",
   :line 289,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([fmt & fmt-args] [throwable fmt & fmt-args]),
   :name "fatalf",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L325",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/fatalf",
   :doc "Fatal level logging using format.",
   :var-type "macro",
   :line 325,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([]),
   :name "find-factory",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L475",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/find-factory",
   :doc
   "Returns the first LogFactory found that is available from commons-logging,\nslf4j-logging, log4j-logging, or java-util-logging. End-users should not need\nto call this.",
   :var-type "function",
   :line 475,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/impl-enabled?",
   :namespace "clojure.contrib.logging",
   :var-type "function",
   :arglists ([log level]),
   :doc
   "Implementation-specific check if a particular level is enabled. End-users\nshould not need to call this.",
   :name "impl-enabled?"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/impl-get-log",
   :namespace "clojure.contrib.logging",
   :var-type "function",
   :arglists ([factory log-ns]),
   :doc
   "Returns an implementation-specific Log by namespace. End-users should not\nneed to call this.",
   :name "impl-get-log"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/impl-name",
   :namespace "clojure.contrib.logging",
   :var-type "function",
   :arglists ([factory]),
   :doc "Returns some text identifying the underlying implementation.",
   :name "impl-name"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/impl-write!",
   :namespace "clojure.contrib.logging",
   :var-type "function",
   :arglists ([log level throwable message]),
   :doc
   "Implementation-specific write of a log message. End-users should not need\nto call this.",
   :name "impl-write!"}
  {:arglists ([message & more] [throwable message & more]),
   :name "info",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L271",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/info",
   :doc "Info level logging using print-style args.",
   :var-type "macro",
   :line 271,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([fmt & fmt-args] [throwable fmt & fmt-args]),
   :name "infof",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L307",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/infof",
   :doc "Info level logging using format.",
   :var-type "macro",
   :line 307,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([]),
   :name "java-util-logging",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L439",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/java-util-logging",
   :doc
   "Returns a java.util.logging-based implementation of the LogFactory protocol,\nor nil if not available. End-users should not need to call this.",
   :var-type "function",
   :line 439,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists
   ([level message]
    [level throwable message]
    [log-ns level throwable message]
    [log-factory log-ns level throwable message]),
   :name "log",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L124",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/log",
   :doc
   "Evaluates and logs a message only if the specified level is enabled. See log*\nfor more details.",
   :var-type "macro",
   :line 124,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([log level throwable message]),
   :name "log*",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L99",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/log*",
   :doc
   "Attempts to log a message, either directly or via an agent; does not check if\nthe level is enabled.\n\nFor performance reasons, an agent will only be used when invoked within a\nrunning transaction, and only for logging levels specified by\n*tx-agent-levels*. This allows those entries to only be written once the\ntransaction commits, and are discarded if it is retried or aborted.  As\ncorollary, other levels (e.g., :debug, :error) will be written even from\nfailed transactions though at the cost of repeat messages during retries.\n\nOne can override the above by setting *force* to :direct or :agent; all\nsubsequent writes will be direct or via an agent, respectively.",
   :var-type "function",
   :line 99,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([log-ns] [log-ns out-level err-level]),
   :name "log-capture!",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L207",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/log-capture!",
   :doc
   "Captures System.out and System.err, piping all writes of those streams to\nthe log. If unspecified, levels default to :info and :error, respectively.\nThe specified log-ns value will be used to namespace all log entries.\n\nNote: use with-logs to redirect output of *out* or *err*.\n\nWarning: if the logging implementation is configured to output to System.out\n(as is the default with java.util.logging) then using this function will\nresult in StackOverflowException when writing to the log.",
   :var-type "function",
   :line 207,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([level log-ns]),
   :name "log-stream",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L189",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/log-stream",
   :doc
   "Creates a PrintStream that will output to the log at the specified level.",
   :var-type "function",
   :line 189,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([]),
   :name "log-uncapture!",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L227",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/log-uncapture!",
   :doc "Restores System.out and System.err to their original values.",
   :var-type "function",
   :line 227,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([]),
   :name "log4j-logging",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L405",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/log4j-logging",
   :doc
   "Returns a log4j-based implementation of the LogFactory protocol, or nil if\nnot available. End-users should not need to call this.",
   :var-type "function",
   :line 405,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([level fmt & fmt-args] [level throwable fmt & fmt-args]),
   :name "logf",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L151",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/logf",
   :doc
   "Logs a message using a format string and args. Can optionally take a\nthrowable as its second arg. See level-specific macros, e.g., debugf.",
   :var-type "macro",
   :line 151,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([level message & more] [level throwable message & more]),
   :name "logp",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L138",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/logp",
   :doc
   "Logs a message using print style args. Can optionally take a throwable as its\nsecond arg. See level-specific macros, e.g., debug.",
   :var-type "macro",
   :line 138,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([]),
   :name "slf4j-logging",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L369",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/slf4j-logging",
   :doc
   "Returns a SLF4J-based implementation of the LogFactory protocol, or nil if\nnot available. End-users should not need to call this.",
   :var-type "function",
   :line 369,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([expr] [level expr]),
   :name "spy",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L173",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/spy",
   :doc
   "Evaluates expr and writes the form and its result to the log. Returns the\nresult of expr. Defaults to debug log level.",
   :var-type "macro",
   :line 173,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([message & more] [throwable message & more]),
   :name "trace",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L259",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/trace",
   :doc "Trace level logging using print-style args.",
   :var-type "macro",
   :line 259,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([fmt & fmt-args] [throwable fmt & fmt-args]),
   :name "tracef",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L295",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/tracef",
   :doc "Trace level logging using format.",
   :var-type "macro",
   :line 295,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([message & more] [throwable message & more]),
   :name "warn",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L277",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/warn",
   :doc "Warn level logging using print-style args.",
   :var-type "macro",
   :line 277,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([fmt & fmt-args] [throwable fmt & fmt-args]),
   :name "warnf",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L313",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/warnf",
   :doc "Warn level logging using format.",
   :var-type "macro",
   :line 313,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([log-ns & body] [[log-ns out-level err-level] & body]),
   :name "with-logs",
   :namespace "clojure.contrib.logging",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj#L236",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/9212f644aa7ef1f13271aa9f941d2c6f8574a571/modules/logging/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/with-logs",
   :doc
   "Evaluates exprs in a context in which *out* and *err* write to the log. The\nspecified log-ns value will be used to namespace all log entries.\n\nBy default *out* and *err* write to :info and :error, respectively.",
   :var-type "macro",
   :line 236,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/logging/src/main/clojure/clojure/contrib/logging.clj"}
  {:arglists ([symbol expansion]),
   :name "defsymbolmacro",
   :namespace "clojure.contrib.macro-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/macro_utils.clj#L227",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/macro_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/defsymbolmacro",
   :doc
   "Define a symbol macro. Because symbol macros are not part of\nClojure's built-in macro expansion system, they can be used only\ninside a with-symbol-macros form.",
   :var-type "macro",
   :line 227,
   :file "clojure/contrib/macro_utils.clj"}
  {:arglists ([name params & forms]),
   :name "deftemplate",
   :namespace "clojure.contrib.macro-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/macro_utils.clj#L241",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/macro_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/deftemplate",
   :doc
   "Define a macro that expands into forms after replacing the\nsymbols in params (a vector) by the corresponding parameters\ngiven in the macro call.",
   :var-type "macro",
   :line 241,
   :file "clojure/contrib/macro_utils.clj"}
  {:arglists ([fn-bindings & exprs]),
   :name "macrolet",
   :namespace "clojure.contrib.macro-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/macro_utils.clj#L206",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/macro_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/macrolet",
   :doc
   "Define local macros that are used in the expansion of exprs. The\nsyntax is the same as for letfn forms.",
   :var-type "macro",
   :line 206,
   :file "clojure/contrib/macro_utils.clj"}
  {:arglists ([form]),
   :name "mexpand",
   :namespace "clojure.contrib.macro-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/macro_utils.clj#L261",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/macro_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/mexpand",
   :doc
   "Like clojure.core/macroexpand, but takes into account symbol macros.",
   :var-type "function",
   :line 261,
   :file "clojure/contrib/macro_utils.clj"}
  {:arglists ([form]),
   :name "mexpand-1",
   :namespace "clojure.contrib.macro-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/macro_utils.clj#L253",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/macro_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/mexpand-1",
   :doc
   "Like clojure.core/macroexpand-1, but takes into account symbol macros.",
   :var-type "function",
   :line 253,
   :file "clojure/contrib/macro_utils.clj"}
  {:arglists ([form]),
   :name "mexpand-all",
   :namespace "clojure.contrib.macro-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/macro_utils.clj#L269",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/macro_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/mexpand-all",
   :doc "Perform a full recursive macro expansion of a form.",
   :var-type "function",
   :line 269,
   :file "clojure/contrib/macro_utils.clj"}
  {:arglists ([symbol-bindings & exprs]),
   :name "symbol-macrolet",
   :namespace "clojure.contrib.macro-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/macro_utils.clj#L217",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/macro_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/symbol-macrolet",
   :doc
   "Define local symbol macros that are used in the expansion of exprs.\nThe syntax is the same as for let forms.",
   :var-type "macro",
   :line 217,
   :file "clojure/contrib/macro_utils.clj"}
  {:arglists ([& exprs]),
   :name "with-symbol-macros",
   :namespace "clojure.contrib.macro-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/macro_utils.clj#L236",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/macro_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/with-symbol-macros",
   :doc "Fully expand exprs, including symbol macros.",
   :var-type "macro",
   :line 236,
   :file "clojure/contrib/macro_utils.clj"}
  {:arglists ([expr]),
   :name "const",
   :namespace "clojure.contrib.macros",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/macros.clj#L18",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/macros.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macros-api.html#clojure.contrib.macros/const",
   :doc "Evaluate the constant expression expr at compile time.",
   :var-type "macro",
   :line 18,
   :file "clojure/contrib/macros.clj"}
  {:arglists ([fn-bindings & exprs]),
   :name "letfn-",
   :namespace "clojure.contrib.macros",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/macros.clj#L28",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/macros.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macros-api.html#clojure.contrib.macros/letfn-",
   :doc
   "OBSOLETE: use clojure.core/letfn\nA variant of let for local function definitions. fn-bindings consists\nof name/args/body triples, with (letfn [name args body] ...)\nbeing equivalent to (let [name (fn name args body)] ...).",
   :var-type "macro",
   :line 28,
   :file "clojure/contrib/macros.clj"}
  {:arglists ([symbols? & body]),
   :name "with-direct-linking",
   :namespace "clojure.contrib.macros",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/macros.clj#L68",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/macros.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macros-api.html#clojure.contrib.macros/with-direct-linking",
   :doc
   "EXPERIMENTAL!\nCompiles the functions in body with direct links to the functions\nnamed in symbols, i.e. without a var lookup for each invocation.\nSymbols is a vector of symbols that name either vars or namespaces.\nA namespace reference is replaced by the list of all symbols in the\nnamespace that are bound to functions. If symbols is not provided,\nthe default value ['clojure.core] is used. The symbol *ns* can be\nused to refer to the current namespace.",
   :var-type "macro",
   :line 68,
   :file "clojure/contrib/macros.clj"}
  {:arglists ([f & maps]),
   :name "deep-merge-with",
   :namespace "clojure.contrib.map-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/map-utils/src/main/clojure/clojure/contrib/map_utils.clj#L41",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/map-utils/src/main/clojure/clojure/contrib/map_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//map-utils-api.html#clojure.contrib.map-utils/deep-merge-with",
   :doc
   "Like merge-with, but merges maps recursively, applying the given fn\nonly when there's a non-map at a particular level.\n\n(deepmerge + {:a {:b {:c 1 :d {:x 1 :y 2}} :e 3} :f 4}\n             {:a {:b {:c 2 :d {:z 9} :z 3} :e 100}})\n-> {:a {:b {:z 3, :c 3, :d {:z 9, :x 1, :y 2}}, :e 103}, :f 4}",
   :var-type "function",
   :line 41,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/map-utils/src/main/clojure/clojure/contrib/map_utils.clj"}
  {:arglists ([map key not-found]),
   :name "lazy-get",
   :namespace "clojure.contrib.map-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/map-utils/src/main/clojure/clojure/contrib/map_utils.clj#L22",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/map-utils/src/main/clojure/clojure/contrib/map_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//map-utils-api.html#clojure.contrib.map-utils/lazy-get",
   :doc
   "Like get, but doesn't evaluate not-found unless it is needed.",
   :var-type "macro",
   :line 22,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/map-utils/src/main/clojure/clojure/contrib/map_utils.clj"}
  {:arglists ([map key]),
   :name "safe-get",
   :namespace "clojure.contrib.map-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/map-utils/src/main/clojure/clojure/contrib/map_utils.clj#L29",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/map-utils/src/main/clojure/clojure/contrib/map_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//map-utils-api.html#clojure.contrib.map-utils/safe-get",
   :doc "Like get, but throws an exception if the key is not found.",
   :var-type "function",
   :line 29,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/map-utils/src/main/clojure/clojure/contrib/map_utils.clj"}
  {:arglists ([map ks]),
   :name "safe-get-in",
   :namespace "clojure.contrib.map-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/map-utils/src/main/clojure/clojure/contrib/map_utils.clj#L35",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/map-utils/src/main/clojure/clojure/contrib/map_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//map-utils-api.html#clojure.contrib.map-utils/safe-get-in",
   :doc
   "Like get-in, but throws an exception if any key is not found.",
   :var-type "function",
   :line 35,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/map-utils/src/main/clojure/clojure/contrib/map_utils.clj"}
  {:arglists ([n]),
   :name "abs",
   :namespace "clojure.contrib.math",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj#L122",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/abs",
   :doc "(abs n) is the absolute value of n",
   :var-type "function",
   :line 122,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/math/src/main/clojure/clojure/contrib/math.clj"}
  {:arglists ([n]),
   :name "ceil",
   :namespace "clojure.contrib.math",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj#L141",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/ceil",
   :doc
   "(ceil n) returns the least integer greater than or equal to n.\nIf n is an exact number, ceil returns an integer, otherwise a double.",
   :var-type "function",
   :line 141,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/math/src/main/clojure/clojure/contrib/math.clj"}
  {:arglists ([n]),
   :name "exact-integer-sqrt",
   :namespace "clojure.contrib.math",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj#L206",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/exact-integer-sqrt",
   :doc
   "(exact-integer-sqrt n) expects a non-negative integer n, and returns [s r] where n = s^2+r and n < (s+1)^2.  In other words, it returns the floor of the square root and the 'remainder'.\nFor example, (exact-integer-sqrt 15) is [3 6] because 15 = 3^2+6.",
   :var-type "function",
   :line 206,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/math/src/main/clojure/clojure/contrib/math.clj"}
  {:arglists ([base pow]),
   :name "expt",
   :namespace "clojure.contrib.math",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj#L101",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/expt",
   :doc
   "(expt base pow) is base to the pow power.\nReturns an exact number if the base is an exact number and the power is an integer, otherwise returns a double.",
   :var-type "function",
   :line 101,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/math/src/main/clojure/clojure/contrib/math.clj"}
  {:arglists ([n]),
   :name "floor",
   :namespace "clojure.contrib.math",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj#L129",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/floor",
   :doc
   "(floor n) returns the greatest integer less than or equal to n.\nIf n is an exact number, floor returns an integer, otherwise a double.",
   :var-type "function",
   :line 129,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/math/src/main/clojure/clojure/contrib/math.clj"}
  {:arglists ([a b]),
   :name "gcd",
   :namespace "clojure.contrib.math",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj#L162",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/gcd",
   :doc "(gcd a b) returns the greatest common divisor of a and b",
   :var-type "function",
   :line 162,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/math/src/main/clojure/clojure/contrib/math.clj"}
  {:arglists ([a b]),
   :name "lcm",
   :namespace "clojure.contrib.math",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj#L169",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/lcm",
   :doc "(lcm a b) returns the least common multiple of a and b",
   :var-type "function",
   :line 169,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/math/src/main/clojure/clojure/contrib/math.clj"}
  {:arglists ([n]),
   :name "round",
   :namespace "clojure.contrib.math",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj#L153",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/round",
   :doc
   "(round n) rounds to the nearest integer.\nround always returns an integer.  Rounds up for values exactly in between two integers.",
   :var-type "function",
   :line 153,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/math/src/main/clojure/clojure/contrib/math.clj"}
  {:arglists ([n]),
   :name "sqrt",
   :namespace "clojure.contrib.math",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj#L215",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/math/src/main/clojure/clojure/contrib/math.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/sqrt",
   :doc "Square root, but returns exact number if possible.",
   :var-type "function",
   :line 215,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/math/src/main/clojure/clojure/contrib/math.clj"}
  {:arglists ([container]),
   :name "components",
   :namespace "clojure.contrib.miglayout",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout.clj#L75",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout/components",
   :doc
   "Returns a map from id (a keyword) to component for all components with\nan id constraint set",
   :var-type "function",
   :line 75,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/miglayout/src/main/clojure/clojure/contrib/miglayout.clj"}
  {:arglists ([container & args]),
   :name "miglayout",
   :namespace "clojure.contrib.miglayout",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout.clj#L37",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout/miglayout",
   :doc
   "Adds java.awt.Components to a javax.swing.JComponent with constraints\nformatted for the MiGLayout layout manager.\n\nArguments: container [item constraint*]*\n\n  - container: the container for the specified components, its layout\n    manager will be set to a new instance of MigLayout\n\n  - an inline series of items and constraints--each item may be followed\n    by zero or more constraints.\n\nItem:\n\n  - An item is either a Component or one of the keywords :layout\n   :column or :row. Constraints for a keyword item affect the entire\n    layout.\n\nConstraint: string, keyword, vector, map, or set\n\n  - A string specifies one or more constraints each with zero or more\n    arguments.\n  - A keyword specifies a single constraint without arguments\n  - A vector specifies a single constraint with one or more arguments\n  - A map specifies one or more constraints as keys, each mapped to a\n    single argument\n  - A set groups two or more constraints, each a string, keyword,\n    vector, map, or set\n\nAny items marked with an \"id\" constraint will be included in a map from\nid to component attached to the container. The map can be retrieved using\nclojure.contrib.miglayout/components.",
   :var-type "function",
   :line 37,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/miglayout/src/main/clojure/clojure/contrib/miglayout.clj"}
  {:arglists ([buf]),
   :name "buffer-stream",
   :namespace "clojure.contrib.mmap",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/mmap/src/main/clojure/clojure/contrib/mmap.clj#L39",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/mmap/src/main/clojure/clojure/contrib/mmap.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mmap-api.html#clojure.contrib.mmap/buffer-stream",
   :doc
   "Returns an InputStream for a ByteBuffer, such as returned by mmap.",
   :var-type "function",
   :line 39,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/mmap/src/main/clojure/clojure/contrib/mmap.clj"}
  {:arglists ([f]),
   :name "mmap",
   :namespace "clojure.contrib.mmap",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/mmap/src/main/clojure/clojure/contrib/mmap.clj#L27",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/mmap/src/main/clojure/clojure/contrib/mmap.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mmap-api.html#clojure.contrib.mmap/mmap",
   :doc "Memory-map the file named f.  Returns a ByteBuffer.",
   :var-type "function",
   :line 27,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/mmap/src/main/clojure/clojure/contrib/mmap.clj"}
  {:arglists ([f]),
   :name "slurp",
   :namespace "clojure.contrib.mmap",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/mmap/src/main/clojure/clojure/contrib/mmap.clj#L33",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/mmap/src/main/clojure/clojure/contrib/mmap.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mmap-api.html#clojure.contrib.mmap/slurp",
   :doc "Reads the file named by f and returns it as a string.",
   :var-type "function",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/mmap/src/main/clojure/clojure/contrib/mmap.clj"}
  {:arglists ([val] [val expectation-hash]),
   :name "calls",
   :namespace "clojure.contrib.mock",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L209",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/calls",
   :doc
   "Creates or associates to an existing expectation hash the :calls key with a\nfunction that will be called with the given arguments. The return value from\nthis function will be returned by the expected function. If both this\nand :returns are specified, the return value of :calls will have precedence.\nUsage:\n(calls some-fn expectation-hash?)",
   :var-type "function",
   :line 209,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([expect-bindings & body]),
   :name "expect",
   :namespace "clojure.contrib.mock",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L258",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/expect",
   :doc
   "Use expect to redirect calls to dependent functions that are made within the\ncode under test. Instead of calling the functions that would normally be used\ntemporary stubs are used, which can verify function parameters and call counts.\nReturn values of overridden functions can also be specified as needed.\nUsage:\n(expect [dep-fn (has-args [arg-pred1] (times n (returns x)))]\n        (function-under-test a b c))",
   :var-type "macro",
   :line 258,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([arg-pred-forms] [arg-pred-forms expectation-hash]),
   :name "has-args",
   :namespace "clojure.contrib.mock",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L223",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/has-args",
   :doc
   "Creates or associates to an existing expectation hash the :has-args key with\na value corresponding to a function that will either return true if its\nargument expectations are met or throw an exception with the details of the\nfirst failed argument it encounters.\nOnly specify as many predicates as you are interested in verifying. The rest\nof the values are safely ignored.\nUsage:\n(has-args [arg-pred-1 arg-pred-2 ... arg-pred-n] expectation-hash?)",
   :var-type "macro",
   :line 223,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([fn-name args]),
   :name "has-matching-signature?",
   :namespace "clojure.contrib.mock",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L102",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/has-matching-signature?",
   :doc
   "Calls no-matching-function-signature if no match is found for the given\nfunction. If no argslist meta data is available for the function, it is\nnot called.",
   :var-type "function",
   :line 102,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([arg-preds arg-pred-forms]),
   :name "make-arg-checker",
   :namespace "clojure.contrib.mock",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L113",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/make-arg-checker",
   :doc
   "Creates the argument verifying function for a replaced dependency within\nthe expectation bound scope. These functions take the additional argument\nof the name of the replaced function, then the rest of their args. It is\ndesigned to be called from the mock function generated in the first argument\nof the mock info object created by make-mock.",
   :var-type "function",
   :line 113,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([pred pred-form]),
   :name "make-count-checker",
   :namespace "clojure.contrib.mock",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L129",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/make-count-checker",
   :doc
   "creates the count checker that is invoked at the end of an expectation, after\nthe code under test has all been executed. The function returned takes the\nname of the associated dependency and the invocation count as arguments.",
   :var-type "function",
   :line 129,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([fn-name expectation-hash]),
   :name "make-mock",
   :namespace "clojure.contrib.mock",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L138",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/make-mock",
   :doc
   "creates a vector containing the following information for the named function:\n1. dependent function replacement - verifies signature, calls arg checker\nincreases count, returns return value.\n2. an atom containing the invocation count\n3. the invocation count checker function\n4. a symbol of the name of the function being replaced.",
   :var-type "function",
   :line 138,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([val] [val expectation-hash]),
   :name "returns",
   :namespace "clojure.contrib.mock",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L197",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/returns",
   :doc
   "Creates or associates to an existing expectation hash the :returns key with\na value to be returned by the expectation after a successful invocation\nmatching its expected arguments (if applicable).\nUsage:\n(returns ret-value expectation-hash?)",
   :var-type "function",
   :line 197,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([times-fn] [times-fn expectation-hash]),
   :name "times",
   :namespace "clojure.contrib.mock",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L240",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/times",
   :doc
   "Creates or associates to an existing expectation hash the :times key with a\nvalue corresponding to a predicate function which expects an integer value.\nAlso, an integer can be specified, in which case the times will only be an\nexact match. The times check is called at the end of an expect expression to\nvalidate that an expected dependency function was called the expected\nnumber of times.\nUsage:\n(times n)\n(times #(> n %))\n(times n expectation-hash)",
   :var-type "macro",
   :line 240,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([mock-data]),
   :name "validate-counts",
   :namespace "clojure.contrib.mock",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L163",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/validate-counts",
   :doc
   "given the sequence of all mock data for the expectation, simply calls the\ncount checker for each dependency.",
   :var-type "function",
   :line 163,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([]),
   :name "flush",
   :namespace "clojure.contrib.monadic-io-streams",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L62",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/flush",
   :doc "Flush",
   :var-type "function",
   :line 62,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj"}
  {:arglists ([obj]),
   :name "print",
   :namespace "clojure.contrib.monadic-io-streams",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L67",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/print",
   :doc "Print obj",
   :var-type "function",
   :line 67,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj"}
  {:arglists ([] [obj]),
   :name "println",
   :namespace "clojure.contrib.monadic-io-streams",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L72",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/println",
   :doc "Print obj followed by a newline",
   :var-type "function",
   :line 72,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj"}
  {:arglists ([]),
   :name "read-char",
   :namespace "clojure.contrib.monadic-io-streams",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L42",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/read-char",
   :doc "Read a single character",
   :var-type "function",
   :line 42,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj"}
  {:arglists ([]),
   :name "read-line",
   :namespace "clojure.contrib.monadic-io-streams",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L47",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/read-line",
   :doc "Read a single line",
   :var-type "function",
   :line 47,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj"}
  {:arglists ([]),
   :name "read-lines",
   :namespace "clojure.contrib.monadic-io-streams",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L126",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/read-lines",
   :doc "Read all lines and return them in a vector",
   :var-type "function",
   :line 126,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj"}
  {:arglists ([n]),
   :name "skip-chars",
   :namespace "clojure.contrib.monadic-io-streams",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L52",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/skip-chars",
   :doc "Skip n characters",
   :var-type "function",
   :line 52,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj"}
  {:arglists ([io-specs statement]),
   :name "with-io-streams",
   :namespace "clojure.contrib.monadic-io-streams",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L98",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/with-io-streams",
   :doc
   "Open one or more streams as specified by io-spec, run a monadic\nI/O statement on them, and close the streams. io-spec is\na binding-like vector in which each stream is specified by\nthree element: a keyword by which the stream can be referred to,\nthe stream mode (:read or :write), and a stream specification as\naccepted by clojure.java.io/reader (mode :read) or\nclojure.java.io/writer (mode :write). The statement\nis run on a state which is a map from keywords to corresponding\nstreams. Single-stream monadic I/O statements must be wrapped\nwith clojure.contrib.monads/with-state-field.",
   :var-type "function",
   :line 98,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj"}
  {:arglists ([reader-spec statement]),
   :name "with-reader",
   :namespace "clojure.contrib.monadic-io-streams",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L82",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/with-reader",
   :doc
   "Create a reader from reader-spec, run the monadic I/O statement\non it, and close the reader. reader-spec can be any object accepted\nby clojure.java.io/reader.",
   :var-type "function",
   :line 82,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj"}
  {:arglists ([writer-spec statement]),
   :name "with-writer",
   :namespace "clojure.contrib.monadic-io-streams",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L90",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/with-writer",
   :doc
   "Create a writer from writer-spec, run the monadic I/O statement\non it, and close the writer. writer-spec can be any object accepted\nby clojure.java.io/writer.",
   :var-type "function",
   :line 90,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj"}
  {:arglists ([text]),
   :name "write",
   :namespace "clojure.contrib.monadic-io-streams",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L57",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/2c6c9e3eca8039964b451be38cdf9d7044dd0b06/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/write",
   :doc "Write text (a string)",
   :var-type "function",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monadic-io-streams/src/main/clojure/clojure/contrib/monadic_io_streams.clj"}
  {:arglists ([f]),
   :name "call-cc",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L456",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/call-cc",
   :doc
   "A computation in the cont monad that calls function f with a single\nargument representing the current continuation. The function f should\nreturn a continuation (which becomes the return value of call-cc),\nor call the passed-in current continuation to terminate.",
   :var-type "function",
   :line 456,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L440",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/cont-m",
   :namespace "clojure.contrib.monads",
   :line 440,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Monad describing computations in continuation-passing style. The monadic\nvalues are functions that are called with a single argument representing\nthe continuation of the computation, to which they pass their result.",
   :name "cont-m"}
  {:arglists ([name doc-string operations] [name operations]),
   :name "defmonad",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L51",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/defmonad",
   :doc
   "Define a named monad by defining the monad operations. The definitions\nare written like bindings to the monad operations m-bind and\nm-result (required) and m-zero and m-plus (optional).",
   :var-type "macro",
   :line 51,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists
   ([name docstring? attr-map? args expr]
    [name docstring? attr-map? (args expr) ...]),
   :name "defmonadfn",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L137",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/defmonadfn",
   :doc
   "Like defn, but for functions that use monad operations and are used inside\na with-monad block.",
   :var-type "macro",
   :line 137,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([steps expr] [name steps expr]),
   :name "domonad",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L114",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/domonad",
   :doc
   "Monad comprehension. Takes the name of a monad, a vector of steps\ngiven as binding-form/monadic-expression pairs, and a result value\nspecified by expr. The monadic-expression terms can use the binding\nvariables of the previous steps.\nIf the monad contains a definition of m-zero, the step list can also\ncontain conditions of the form :when p, where the predicate p can\ncontain the binding variables from all previous steps.\nA clause of the form :let [binding-form expr ...], where the bindings\nare given as a vector as for the use in let, establishes additional\nbindings that can be used in the following steps.",
   :var-type "macro",
   :line 114,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([]),
   :name "fetch-state",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L359",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/fetch-state",
   :doc
   "Return a state-monad function that returns the current state and does not\nmodify it.",
   :var-type "function",
   :line 359,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([key]),
   :name "fetch-val",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L365",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/fetch-val",
   :doc
   "Return a state-monad function that assumes the state to be a map and\nreturns the value corresponding to the given key. The state is not modified.",
   :var-type "function",
   :line 365,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L286",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/identity-m",
   :namespace "clojure.contrib.monads",
   :line 286,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Monad describing plain computations. This monad does in fact nothing\nat all. It is useful for testing, for combination with monad\ntransformers, and for code that is parameterized with a monad.",
   :name "identity-m"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L217",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-chain",
   :namespace "clojure.contrib.monads",
   :line 217,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Chains together monadic computation steps that are each functions\nof one parameter. Each step is called with the result of the previous\nstep as its argument. (m-chain (step1 step2)) is equivalent to\n(fn [x] (domonad [r1 (step1 x) r2 (step2 r1)] r2)).",
   :name "m-chain"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L195",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-fmap",
   :namespace "clojure.contrib.monads",
   :line 195,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Bind the monadic value m to the function returning (f x) for argument x",
   :name "m-fmap"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L189",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-join",
   :namespace "clojure.contrib.monads",
   :line 189,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Converts a monadic value containing a monadic value into a 'simple'\nmonadic value.",
   :name "m-join"}
  {:arglists ([n f]),
   :name "m-lift",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L180",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-lift",
   :doc
   "Converts a function f of n arguments into a function of n\nmonadic arguments returning a monadic value.",
   :var-type "macro",
   :line 180,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L211",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-map",
   :namespace "clojure.contrib.monads",
   :line 211,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "'Executes' the sequence of monadic values resulting from mapping\nf onto the values xs. f must return a monadic value.",
   :name "m-map"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L228",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-reduce",
   :namespace "clojure.contrib.monads",
   :line 228,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Return the reduction of (m-lift 2 f) over the list of monadic values mvs\nwith initial value (m-result val).",
   :name "m-reduce"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L200",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-seq",
   :namespace "clojure.contrib.monads",
   :line 200,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "'Executes' the monadic values in ms and returns a sequence of the\nbasic values contained in them.",
   :name "m-seq"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L241",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-until",
   :namespace "clojure.contrib.monads",
   :line 241,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "While (p x) is false, replace x by the value returned by the\nmonadic computation (f x). Return (m-result x) for the first\nx for which (p x) is true.",
   :name "m-until"}
  {:arglists ([test m-expr]),
   :name "m-when",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L253",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-when",
   :doc
   "If test is logical true, return monadic value m-expr, else return\n(m-result nil).",
   :var-type "macro",
   :line 253,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([test m-expr]),
   :name "m-when-not",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L259",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-when-not",
   :doc
   "If test if logical false, return monadic value m-expr, else return\n(m-result nil).",
   :var-type "macro",
   :line 259,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L296",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/maybe-m",
   :namespace "clojure.contrib.monads",
   :line 296,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Monad describing computations with possible failures. Failure is\nrepresented by nil, any other value is considered valid. As soon as\na step returns nil, the whole computation will yield nil as well.",
   :name "maybe-m"}
  {:arglists ([m] [m nothing] [m nothing which-m-plus]),
   :name "maybe-t",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L496",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/maybe-t",
   :doc
   "Monad transformer that transforms a monad m into a monad in which\nthe base values can be invalid (represented by nothing, which defaults\nto nil). The third argument chooses if m-zero and m-plus are inherited\nfrom the base monad (use :m-plus-from-base) or adopt maybe-like\nbehaviour (use :m-plus-from-transformer). The default is :m-plus-from-base\nif the base monad m has a definition for m-plus, and\n:m-plus-from-transformer otherwise.",
   :var-type "function",
   :line 496,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([operations]),
   :name "monad",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L36",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/monad",
   :doc
   "Define a monad by defining the monad operations. The definitions\nare written like bindings to the monad operations m-bind and\nm-result (required) and m-zero and m-plus (optional).",
   :var-type "macro",
   :line 36,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([base which-m-plus operations]),
   :name "monad-transformer",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L474",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/monad-transformer",
   :doc
   "Define a monad transforer in terms of the monad operations and the base\nmonad. The argument which-m-plus chooses if m-zero and m-plus are taken\nfrom the base monad or from the transformer.",
   :var-type "macro",
   :line 474,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([c]),
   :name "run-cont",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L451",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/run-cont",
   :doc
   "Execute the computation c in the cont monad and return its result.",
   :var-type "function",
   :line 451,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L309",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/sequence-m",
   :namespace "clojure.contrib.monads",
   :line 309,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Monad describing multi-valued computations, i.e. computations\nthat can yield multiple values. Any object implementing the seq\nprotocol can be used as a monadic value.",
   :name "sequence-m"}
  {:arglists ([m] [m which-m-plus]),
   :name "sequence-t",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L528",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/sequence-t",
   :doc
   "Monad transformer that transforms a monad m into a monad in which\nthe base values are sequences. The argument which-m-plus chooses\nif m-zero and m-plus are inherited from the base monad\n(use :m-plus-from-base) or adopt sequence-like\nbehaviour (use :m-plus-from-transformer). The default is :m-plus-from-base\nif the base monad m has a definition for m-plus, and\n:m-plus-from-transformer otherwise.",
   :var-type "function",
   :line 528,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L323",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/set-m",
   :namespace "clojure.contrib.monads",
   :line 323,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Monad describing multi-valued computations, like sequence-m,\nbut returning sets of results instead of sequences of results.",
   :name "set-m"}
  {:arglists ([s]),
   :name "set-state",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L353",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/set-state",
   :doc
   "Return a state-monad function that replaces the current state by s and\nreturns the previous state.",
   :var-type "function",
   :line 353,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([key val]),
   :name "set-val",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L383",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/set-val",
   :doc
   "Return a state-monad function that assumes the state to be a map and\nreplaces the value associated with key by val. The old value is returned.",
   :var-type "function",
   :line 383,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L336",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/state-m",
   :namespace "clojure.contrib.monads",
   :line 336,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Monad describing stateful computations. The monadic values have the\nstructure (fn [old-state] [result new-state]).",
   :name "state-m"}
  {:arglists ([p f x]),
   :name "state-m-until",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L401",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/state-m-until",
   :doc
   "An optimized implementation of m-until for the state monad that\nreplaces recursion by a loop.",
   :var-type "function",
   :line 401,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([m]),
   :name "state-t",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L555",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/state-t",
   :doc
   "Monad transformer that transforms a monad m into a monad of stateful\ncomputations that have the base monad type as their result.",
   :var-type "function",
   :line 555,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([f]),
   :name "update-state",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L347",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/update-state",
   :doc
   "Return a state-monad function that replaces the current state by the\nresult of f applied to the current state and that returns the old state.",
   :var-type "function",
   :line 347,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([key f]),
   :name "update-val",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L373",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/update-val",
   :doc
   "Return a state-monad function that assumes the state to be a map and\nreplaces the value associated with the given key by the return value\nof f applied to the old value. The old value is returned.",
   :var-type "function",
   :line 373,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([monad & exprs]),
   :name "with-monad",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L102",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/with-monad",
   :doc
   "Evaluates an expression after replacing the keywords defining the\nmonad operations by the functions associated with these keywords\nin the monad definition given by name.",
   :var-type "macro",
   :line 102,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([key statement]),
   :name "with-state-field",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L389",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/with-state-field",
   :doc
   "Returns a state-monad function that expects a map as its state and\nruns statement (another state-monad function) on the state defined by\nthe map entry corresponding to key. The map entry is updated with the\nnew state returned by statement.",
   :var-type "function",
   :line 389,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([empty-accumulator]),
   :name "writer-m",
   :namespace "clojure.contrib.monads",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj#L413",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/monads/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/writer-m",
   :doc
   "Monad describing computations that accumulate data on the side, e.g. for\nlogging. The monadic values have the structure [value log]. Any of the\naccumulators from clojure.contrib.accumulators can be used for storing the\nlog data. Its empty value is passed as a parameter.",
   :var-type "function",
   :line 413,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/monads/src/main/clojure/clojure/contrib/monads.clj"}
  {:arglists ([nsname]),
   :name "dir",
   :namespace "clojure.contrib.ns-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj#L84",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/dir",
   :doc "Prints a sorted directory of public vars in a namespace",
   :var-type "macro",
   :line 84,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj"}
  {:arglists ([nsname]),
   :name "docs",
   :namespace "clojure.contrib.ns-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj#L89",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/docs",
   :doc "Prints documentation for the public vars in a namespace",
   :var-type "macro",
   :line 89,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj"}
  {:arglists ([ns-sym]),
   :name "get-ns",
   :namespace "clojure.contrib.ns-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj#L50",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/get-ns",
   :doc
   "Returns the namespace named by ns-sym or throws if the\nnamespace does not exist",
   :var-type "function",
   :line 50,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj"}
  {:arglists ([& ns-names]),
   :name "immigrate",
   :namespace "clojure.contrib.ns-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj#L94",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/immigrate",
   :doc
   "Create a public var in this namespace for each public var in the\nnamespaces named by ns-names. The created vars have the same name, root\nbinding, and metadata as the original except that their :ns metadata\nvalue is this namespace.",
   :var-type "function",
   :line 94,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj"}
  {:arglists ([ns]),
   :name "ns-vars",
   :namespace "clojure.contrib.ns-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj#L58",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/ns-vars",
   :doc
   "Returns a sorted seq of symbols naming public vars in\na namespace",
   :var-type "function",
   :line 58,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj"}
  {:arglists ([ns]),
   :name "print-dir",
   :namespace "clojure.contrib.ns-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj#L64",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/print-dir",
   :doc "Prints a sorted directory of public vars in a namespace",
   :var-type "function",
   :line 64,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj"}
  {:arglists ([ns]),
   :name "print-docs",
   :namespace "clojure.contrib.ns-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj#L70",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/print-docs",
   :doc "Prints documentation for the public vars in a namespace",
   :var-type "function",
   :line 70,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj"}
  {:arglists ([nsname]),
   :name "vars",
   :namespace "clojure.contrib.ns-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj#L78",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/6b0ced91e42eca3be551f10468abcb9a2983d7b8/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/vars",
   :doc
   "Returns a sorted seq of symbols naming public vars in\na namespace",
   :var-type "macro",
   :line 78,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/ns-utils/src/main/clojure/clojure/contrib/ns_utils.clj"}
  {:arglists ([& keyvals]),
   :name "priority-map",
   :namespace "clojure.contrib.priority-map",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/37fba7ef6697b2e46db7d38b463dba81d3b1c4e7/modules/priority-map/src/main/clojure/clojure/contrib/priority_map.clj#L306",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/37fba7ef6697b2e46db7d38b463dba81d3b1c4e7/modules/priority-map/src/main/clojure/clojure/contrib/priority_map.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//priority-map-api.html#clojure.contrib.priority-map/priority-map",
   :doc
   "keyval => key val\nReturns a new priority map with supplied mappings",
   :var-type "function",
   :line 306,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/priority-map/src/main/clojure/clojure/contrib/priority_map.clj"}
  {:arglists ([comparator & keyvals]),
   :name "priority-map-by",
   :namespace "clojure.contrib.priority-map",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/37fba7ef6697b2e46db7d38b463dba81d3b1c4e7/modules/priority-map/src/main/clojure/clojure/contrib/priority_map.clj#L312",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/37fba7ef6697b2e46db7d38b463dba81d3b1c4e7/modules/priority-map/src/main/clojure/clojure/contrib/priority_map.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//priority-map-api.html#clojure.contrib.priority-map/priority-map-by",
   :doc
   "keyval => key val\nReturns a new priority map with supplied mappings",
   :var-type "function",
   :line 312,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/priority-map/src/main/clojure/clojure/contrib/priority_map.clj"}
  {:arglists ([v]),
   :name "certainly",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L146",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/certainly",
   :doc
   "Returns a distribution in which the single value v has probability 1.",
   :var-type "function",
   :line 146,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj"}
  {:arglists ([& choices]),
   :name "choose",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L92",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/choose",
   :doc
   "Construct a distribution from an explicit list of probabilities\nand values. They are given in the form of a vector of probability-value\npairs. In the last pair, the probability can be given by the keyword\n:else, which stands for 1 minus the total of the other probabilities.",
   :var-type "function",
   :line 92,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L46",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/cond-dist-m",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :line 46,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :var-type "var",
   :doc "Variant of the dist monad that can handle undefined values.",
   :name "cond-dist-m"}
  {:arglists ([pred dist]),
   :name "cond-prob",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L160",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/cond-prob",
   :doc
   "Returns the conditional probability for the values in dist that satisfy\nthe predicate pred.",
   :var-type "function",
   :line 160,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L28",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/dist-m",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :var-type "var",
   :doc
   "Monad describing computations on fuzzy quantities, represented by a finite\nprobability distribution for the possible values. A distribution is\nrepresented by a map from values to probabilities.",
   :name "dist-m"}
  {:arglists ([f dist1 dist2]),
   :name "join-with",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L151",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/join-with",
   :doc
   "Returns the distribution of (f x y) with x from dist1 and y from dist2.",
   :var-type "function",
   :line 151,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj"}
  {:arglists ([coll f]),
   :name "make-distribution",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L134",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/make-distribution",
   :doc
   "Returns the distribution in which each element x of the collection\nhas a probability proportional to (f x)",
   :var-type "function",
   :line 134,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj"}
  {:arglists ([weights]),
   :name "normalize",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L70",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/normalize",
   :doc
   "Convert a weight map (e.g. a map of counter values) to a distribution\nby multiplying with a normalization factor. If the map has a key\n:total, its value is assumed to be the sum over all the other values and\nit is used for normalization. Otherwise, the sum is calculated\nexplicitly. The :total key is removed from the resulting distribution.",
   :var-type "function",
   :line 70,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj"}
  {:arglists ([pred dist]),
   :name "prob",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L197",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/prob",
   :doc
   "Return the probability that the predicate pred is satisfied in the\ndistribution dist, i.e. the sum of the probabilities of the values\nthat satisfy pred.",
   :var-type "function",
   :line 197,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj"}
  {:arglists ([coll]),
   :name "uniform",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L84",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/uniform",
   :doc
   "Return a distribution in which each of the elements of coll\nhas the same probability.",
   :var-type "function",
   :line 84,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj"}
  {:arglists ([s n]),
   :name "zipf",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L140",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/zipf",
   :doc
   "Returns the Zipf distribution in which the numbers k=1..n have\nprobabilities proportional to 1/k^s.",
   :var-type "function",
   :line 140,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj"}
  {:arglists ([dist]),
   :name "discrete",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L87",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/discrete",
   :doc
   "A discrete distribution, defined by a map dist mapping values\nto probabilities. The sum of probabilities must be one.",
   :var-type "function",
   :line 87,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj"}
  {:arglists ([lambda]),
   :name "exponential",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L146",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/exponential",
   :doc
   "Transform a sequence of uniform random numbers in the interval [0, 1)\ninto a sequence of exponential random numbers with parameter lambda.",
   :var-type "function",
   :line 146,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj"}
  {:arglists ([mu sigma]),
   :name "lognormal",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L137",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/lognormal",
   :doc
   "Transform a sequence of uniform random numbesr in the interval [0, 1)\ninto a sequence of lognormal random numbers with mean mu and standard\ndeviation sigma.",
   :var-type "function",
   :line 137,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj"}
  {:arglists ([n r]),
   :name "n-sphere",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L228",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/n-sphere",
   :doc
   "Return a uniform distribution of n-dimensional vectors inside an\nn-sphere of radius r.",
   :var-type "function",
   :line 228,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj"}
  {:arglists ([mu sigma]),
   :name "normal",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L116",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/normal",
   :doc
   "Transform a sequence urs of uniform random number in the interval [0, 1)\ninto a sequence of normal random numbers with mean mu and standard\ndeviation sigma.",
   :var-type "function",
   :line 116,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj"}
  {:arglists ([mu sigma]),
   :name "normal-box-muller",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L163",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/normal-box-muller",
   :doc
   "Transform a sequence of uniform random numbers in the interval [0, 1)\ninto a sequence of normal random numbers with mean mu and standard\ndeviation sigma.",
   :var-type "function",
   :line 163,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj"}
  {:arglists ([distribution random-stream-state]),
   :name "random-stream",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L62",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/random-stream",
   :doc
   "Define a random stream by a distribution and the state of a\nrandom number stream with uniform distribution in [0, 1).",
   :var-type "function",
   :line 62,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj"}
  {:arglists ([p dist]),
   :name "reject",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L74",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/reject",
   :doc
   "Return the distribution that results from rejecting the values from\ndist that do not satisfy predicate p.",
   :var-type "function",
   :line 74,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj"}
  {:arglists ([n dist]),
   :name "sample",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L182",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/sample",
   :doc
   "Return the distribution of samples of length n from the\ndistribution dist",
   :var-type "function",
   :line 182,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj"}
  {:arglists ([n dist]),
   :name "sample-mean",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L182",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/sample-mean",
   :doc
   "Return the distribution of the mean over n samples from the\ndistribution dist",
   :var-type "function",
   :line 182,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj"}
  {:arglists ([n dist]),
   :name "sample-mean-variance",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L182",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/sample-mean-variance",
   :doc
   "Return the distribution of the mean-and-variance (a vector containing\nthe mean and the variance) over n samples from the distribution dist",
   :var-type "function",
   :line 182,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj"}
  {:arglists ([f n dist] [f val n dist]),
   :name "sample-reduce",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L182",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/sample-reduce",
   :doc
   "Returns the distribution of the reduction of f over n samples from the\ndistribution dist.",
   :var-type "function",
   :line 182,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj"}
  {:arglists ([n dist]),
   :name "sample-sum",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L182",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/sample-sum",
   :doc
   "Return the distribution of the sum over n samples from the\ndistribution dist.",
   :var-type "function",
   :line 182,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj"}
  {:arglists ([modulus multiplier increment seed]),
   :name "lcg",
   :namespace "clojure.contrib.probabilities.random-numbers",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/random_numbers.clj#L35",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/random_numbers.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.random-numbers-api.html#clojure.contrib.probabilities.random-numbers/lcg",
   :doc "Create a linear congruential generator",
   :var-type "function",
   :line 35,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/random_numbers.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/random_numbers.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/random_numbers.clj#L56",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.random-numbers-api.html#clojure.contrib.probabilities.random-numbers/rand-stream",
   :namespace "clojure.contrib.probabilities.random-numbers",
   :line 56,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/probabilities/src/main/clojure/clojure/contrib/probabilities/random_numbers.clj",
   :var-type "var",
   :doc
   "A random number stream based on clojure.core/rand. Note that this\ngenerator uses an internal mutable state. The state is thus not stored\nin the stream object and cannot be restored.",
   :name "rand-stream"}
  {:name "*enable-profiling*",
   :namespace "clojure.contrib.profile",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/profile/src/main/clojure/clojure/contrib/profile.clj#L42",
   :dynamic true,
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/profile/src/main/clojure/clojure/contrib/profile.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//profile-api.html#clojure.contrib.profile/*enable-profiling*",
   :doc
   "Set this to false before loading/compiling to omit\nprofiling code.",
   :var-type "var",
   :line 42,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/profile/src/main/clojure/clojure/contrib/profile.clj"}
  {:arglists ([profile-summary]),
   :name "print-summary",
   :namespace "clojure.contrib.profile",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/profile/src/main/clojure/clojure/contrib/profile.clj#L95",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/profile/src/main/clojure/clojure/contrib/profile.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//profile-api.html#clojure.contrib.profile/print-summary",
   :doc "Prints a table of the results returned by summarize.",
   :var-type "function",
   :line 95,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/profile/src/main/clojure/clojure/contrib/profile.clj"}
  {:arglists ([name & body]),
   :name "prof",
   :namespace "clojure.contrib.profile",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/profile/src/main/clojure/clojure/contrib/profile.clj#L45",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/profile/src/main/clojure/clojure/contrib/profile.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//profile-api.html#clojure.contrib.profile/prof",
   :doc
   "If *enable-profiling* is true, wraps body in profiling code.\nReturns the result of body. Profile timings will be stored in\n*profile-data* using name, which must be a keyword, as the key.\nTimings are measured with System/nanoTime.",
   :var-type "macro",
   :line 45,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/profile/src/main/clojure/clojure/contrib/profile.clj"}
  {:arglists ([& body]),
   :name "profile",
   :namespace "clojure.contrib.profile",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/profile/src/main/clojure/clojure/contrib/profile.clj#L106",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/profile/src/main/clojure/clojure/contrib/profile.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//profile-api.html#clojure.contrib.profile/profile",
   :doc
   "Runs body with profiling enabled, then prints a summary of\nresults.  Returns nil.",
   :var-type "macro",
   :line 106,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/profile/src/main/clojure/clojure/contrib/profile.clj"}
  {:arglists ([profile-data]),
   :name "summarize",
   :namespace "clojure.contrib.profile",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/profile/src/main/clojure/clojure/contrib/profile.clj#L73",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/profile/src/main/clojure/clojure/contrib/profile.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//profile-api.html#clojure.contrib.profile/summarize",
   :doc
   "Takes the raw data returned by with-profile-data and returns a map\nfrom names to summary statistics.  Each value in the map will look\nlike:\n\n   {:mean ..., :min ..., :max ..., :count ..., :sum ...}\n\n:mean, :min, and :max are how long the profiled section took to run,\nin nanoseconds.  :count is the total number of times the profiled\nsection was executed.  :sum is the total amount of time spent in the\nprofiled section, in nanoseconds.",
   :var-type "function",
   :line 73,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/profile/src/main/clojure/clojure/contrib/profile.clj"}
  {:arglists ([& body]),
   :name "with-profile-data",
   :namespace "clojure.contrib.profile",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/profile/src/main/clojure/clojure/contrib/profile.clj#L63",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/profile/src/main/clojure/clojure/contrib/profile.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//profile-api.html#clojure.contrib.profile/with-profile-data",
   :doc
   "Executes body with *profile-data* bound to an atom of a new map.\nReturns the raw profile data as a map.  Keys in the map are profile\nnames (keywords), and values are lists of elapsed time, in\nnanoseconds.",
   :var-type "macro",
   :line 63,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/profile/src/main/clojure/clojure/contrib/profile.clj"}
  {:name "*html-compatible*",
   :namespace "clojure.contrib.prxml",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/prxml/src/main/clojure/clojure/contrib/prxml.clj#L32",
   :dynamic true,
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/prxml/src/main/clojure/clojure/contrib/prxml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//prxml-api.html#clojure.contrib.prxml/*html-compatible*",
   :doc "If true, empty tags will have a space before the closing />",
   :var-type "var",
   :line 32,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/prxml/src/main/clojure/clojure/contrib/prxml.clj"}
  {:name "*prxml-indent*",
   :namespace "clojure.contrib.prxml",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/prxml/src/main/clojure/clojure/contrib/prxml.clj#L36",
   :dynamic true,
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/prxml/src/main/clojure/clojure/contrib/prxml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//prxml-api.html#clojure.contrib.prxml/*prxml-indent*",
   :doc
   "The number of spaces to indent sub-tags.  nil for no indent\nand no extra line-breaks.",
   :var-type "var",
   :line 36,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/prxml/src/main/clojure/clojure/contrib/prxml.clj"}
  {:arglists ([& args]),
   :name "prxml",
   :namespace "clojure.contrib.prxml",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/prxml/src/main/clojure/clojure/contrib/prxml.clj#L152",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/prxml/src/main/clojure/clojure/contrib/prxml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//prxml-api.html#clojure.contrib.prxml/prxml",
   :doc
   "Print XML to *out*.  Vectors become XML tags: the first item is the\ntag name; optional second item is a map of attributes.\n\nSequences are processed recursively, so you can use map and other\nsequence functions inside prxml.\n\n  (prxml [:p {:class \"greet\"} [:i \"Ladies & gentlemen\"]])\n  ; => <p class=\"greet\"><i>Ladies &amp; gentlemen</i></p>\n\nPSEUDO-TAGS: some keywords have special meaning:\n\n  :raw!      do not XML-escape contents\n  :comment!  create an XML comment\n  :decl!     create an XML declaration, with attributes\n  :cdata!    create a CDATA section\n  :doctype!  create a DOCTYPE!\n\n  (prxml [:p [:raw! \"<i>here & gone</i>\"]])\n  ; => <p><i>here & gone</i></p>\n\n  (prxml [:decl! {:version \"1.1\"}])\n  ; => <?xml version=\"1.1\" encoding=\"UTF-8\"?>",
   :var-type "function",
   :line 152,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/prxml/src/main/clojure/clojure/contrib/prxml.clj"}
  {:arglists ([klass method-name params obj & args]),
   :name "call-method",
   :namespace "clojure.contrib.reflect",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/reflect/src/main/clojure/clojure/contrib/reflect.clj#L12",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/reflect/src/main/clojure/clojure/contrib/reflect.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//reflect-api.html#clojure.contrib.reflect/call-method",
   :doc
   "Calls a private or protected method.\n\nparams is a vector of classes which correspond to the arguments to\nthe method e\n\nobj is nil for static methods, the instance object otherwise.\n\nThe method-name is given a symbol or a keyword (something Named).",
   :var-type "function",
   :line 12,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/reflect/src/main/clojure/clojure/contrib/reflect.clj"}
  {:arglists ([klass field-name obj]),
   :name "get-field",
   :namespace "clojure.contrib.reflect",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/reflect/src/main/clojure/clojure/contrib/reflect.clj#L27",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/reflect/src/main/clojure/clojure/contrib/reflect.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//reflect-api.html#clojure.contrib.reflect/get-field",
   :doc
   "Access to private or protected field.  field-name is a symbol or\nkeyword.",
   :var-type "function",
   :line 27,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/reflect/src/main/clojure/clojure/contrib/reflect.clj"}
  {:arglists ([]),
   :name "print-repl-info",
   :namespace "clojure.contrib.repl-ln",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj#L208",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/print-repl-info",
   :doc "Prints info about the current repl",
   :var-type "function",
   :line 208,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj"}
  {:arglists ([& options]),
   :name "repl",
   :namespace "clojure.contrib.repl-ln",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj#L217",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/repl",
   :doc
   "A repl that supports line numbers. For definitions and evaluations made\nat the repl, the repl-name and line number will be reported as the\norigin. Use set-repl-name and set-repl-prompt to customize the repl name\nand prompt. This repl supports all of the keyword arguments documented\nfor clojure.main/repl with the following change and additions:\n\n     - :prompt has a new default\n       default: #(clojure.core/print (repl-prompt))\n\n     - :name-fmt, Name format string\n       default: the name-fmt of the parent repl, or \"repl-%S\"\n\n     - :prompt-fmt, Prompt format string\n       default: the prompt-fmt of the parent repl, or \"%S:%L %N=> \"",
   :var-type "function",
   :line 217,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj"}
  {:arglists ([]),
   :name "repl-info",
   :namespace "clojure.contrib.repl-ln",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj#L202",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/repl-info",
   :doc "Returns a map of info about the current repl",
   :var-type "function",
   :line 202,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj"}
  {:arglists ([]),
   :name "repl-prompt",
   :namespace "clojure.contrib.repl-ln",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj#L148",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/repl-prompt",
   :doc
   "Returns the current repl prompt based on this repl's prompt-fmt",
   :var-type "function",
   :line 148,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj"}
  {:arglists ([] [name-fmt]),
   :name "set-repl-name",
   :namespace "clojure.contrib.repl-ln",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj#L157",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/set-repl-name",
   :doc
   "Sets the repl name format to the string name-fmt. Include the following\ncodes in the name to make the corresponding dynamic values part of it:\n\n  %S - repl serial number\n  %T - thread id\n  %D - nesting depth in this thread\n\nWith no arguments, resets the repl name to its default: \"repl-%S\"",
   :var-type "function",
   :line 157,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj"}
  {:arglists ([] [prompt-fmt]),
   :name "set-repl-prompt",
   :namespace "clojure.contrib.repl-ln",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj#L180",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/set-repl-prompt",
   :doc
   "Sets the repl prompt. Include the following codes in the prompt to make\nthe corresponding dynamic values part of it:\n\n  %S - repl serial number\n  %T - thread id\n  %D - nesting depth in this thread\n  %L - input line number\n  %N - namespace name\n\nWith no arguments, resets the repl pompt to its default: \"%S:%L %N=> \"",
   :var-type "function",
   :line 180,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj"}
  {:arglists ([& options]),
   :name "stream-repl",
   :namespace "clojure.contrib.repl-ln",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj#L119",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/stream-repl",
   :doc
   "Repl entry point that provides convenient overriding of input, output,\nand err streams via sequential keyword-value pairs. Default values\nfor :in, :out, and :err are streams associated with System/in,\nSystem/out, and System/err using UTF-8 encoding. Also supports all the\noptions provided by clojure.contrib.repl-ln/repl.",
   :var-type "function",
   :line 119,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-ln/src/main/clojure/clojure/contrib/repl_ln.clj"}
  {:name "*local-javadocs*",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/repl_utils/javadoc.clj#L18",
   :dynamic true,
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/repl_utils/javadoc.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/*local-javadocs*",
   :doc
   "Ref to a list of local paths for Javadoc-generated HTML\nfiles.",
   :var-type "var",
   :line 18,
   :file "clojure/contrib/repl_utils/javadoc.clj"}
  {:name "*remote-javadocs*",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/repl_utils/javadoc.clj#L28",
   :dynamic true,
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/repl_utils/javadoc.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/*remote-javadocs*",
   :doc
   "Ref to a map from package name prefixes to URLs for remote\nJavadocs.",
   :var-type "var",
   :line 28,
   :file "clojure/contrib/repl_utils/javadoc.clj"}
  {:arglists ([] [t]),
   :name "add-break-thread!",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj#L122",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/add-break-thread!",
   :doc
   "Add the given thread to break-threads so that it will be stopped\nany time the user presses Ctrl-C.  Calls start-handling-break for\nyou.  Adds the current thread if none is given.",
   :var-type "function",
   :line 122,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj"}
  {:arglists ([path]),
   :name "add-local-javadoc",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/repl_utils/javadoc.clj#L43",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/repl_utils/javadoc.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/add-local-javadoc",
   :doc "Adds to the list of local Javadoc paths.",
   :var-type "function",
   :line 43,
   :file "clojure/contrib/repl_utils/javadoc.clj"}
  {:arglists ([package-prefix url]),
   :name "add-remote-javadoc",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/repl_utils/javadoc.clj#L48",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/repl_utils/javadoc.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/add-remote-javadoc",
   :doc
   "Adds to the list of remote Javadoc URLs.  package-prefix is the\nbeginning of the package name that has docs at this URL.",
   :var-type "function",
   :line 48,
   :file "clojure/contrib/repl_utils/javadoc.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj#L103",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/break-threads",
   :namespace "clojure.contrib.repl-utils",
   :line 103,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj",
   :var-type "var",
   :doc
   "Threads to stop when Ctrl-C is pressed.  See 'add-break-thread!'",
   :name "break-threads"}
  {:arglists ([expr]),
   :name "expression-info",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj#L135",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/expression-info",
   :doc
   "Uses the Clojure compiler to analyze the given s-expr.  Returns\na map with keys :class and :primitive? indicating what the compiler\nconcluded about the return value of the expression.  Returns nil if\nnot type info can be determined at compile-time.\n\nExample: (expression-info '(+ (int 5) (float 10)))\nReturns: {:class float, :primitive? true}",
   :var-type "function",
   :line 135,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj"}
  {:arglists ([classname]),
   :name "find-javadoc-url",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/repl_utils/javadoc.clj#L54",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/repl_utils/javadoc.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/find-javadoc-url",
   :doc
   "Searches for a URL for the given class name.  Tries\n*local-javadocs* first, then *remote-javadocs*.  Returns a string.",
   :var-type "function",
   :line 54,
   :file "clojure/contrib/repl_utils/javadoc.clj"}
  {:arglists ([class-or-object]),
   :name "javadoc",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/repl_utils/javadoc.clj#L74",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/repl_utils/javadoc.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/javadoc",
   :doc
   "Opens a browser window displaying the javadoc for the argument.\nTries *local-javadocs* first, then *remote-javadocs*.",
   :var-type "function",
   :line 74,
   :file "clojure/contrib/repl_utils/javadoc.clj"}
  {:arglists ([ns-name & args]),
   :name "run",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj#L160",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/run",
   :doc
   "Loads the specified namespace and invokes its \"main\" function with\noptional args. ns-name is not evaluated.",
   :var-type "macro",
   :line 160,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj"}
  {:arglists ([ns-sym & args]),
   :name "run*",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj#L153",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/run*",
   :doc
   "Loads the specified namespace and invokes its \"main\" function with\noptional args.",
   :var-type "function",
   :line 153,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj"}
  {:arglists ([x] [x selector]),
   :name "show",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj#L65",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/show",
   :doc
   "With one arg prints all static and instance members of x or (class x).\nEach member is listed with a number which can be given as 'selector'\nto return the member object -- the REPL will print more details for\nthat member.\n\nThe selector also may be a string or regex, in which case only\nmembers whose names match 'selector' as a case-insensitive regex\nwill be printed.\n\nFinally, the selector also may be a predicate, in which case only\nmembers for which the predicate returns true will be printed.  The\npredicate will be passed a single argument, a map that includes the\n:text that will be printed and the :member object itself, as well as\nall the properies of the member object as translated by 'bean'.\n\nExamples: (show Integer)  (show [])  (show String 23)  (show String \"case\")",
   :var-type "function",
   :line 65,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj"}
  {:arglists ([]),
   :name "start-handling-break",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj#L107",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/4083a0695087d34d13dbbe5a9b49d7c7b30ef2c4/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/start-handling-break",
   :doc
   "Register INT signal handler.  After calling this, Ctrl-C will cause\nall break-threads to be stopped.  See 'add-break-thread!'",
   :var-type "function",
   :line 107,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/repl-utils/src/main/clojure/clojure/contrib/repl_utils.clj"}
  {:arglists ([filler-func & optseq]),
   :name "fill-queue",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj#L94",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/fill-queue",
   :doc
   "filler-func will be called in another thread with a single arg\n'fill'.  filler-func may call fill repeatedly with one arg each\ntime which will be pushed onto a queue, blocking if needed until\nthis is possible.  fill-queue will return a lazy seq of the values\nfiller-func has pushed onto the queue, blocking if needed until each\nnext element becomes available.  filler-func's return value is ignored.",
   :var-type "function",
   :line 94,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/seq/src/main/clojure/clojure/contrib/seq.clj"}
  {:arglists ([pred coll]),
   :name "find-first",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj#L85",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/find-first",
   :doc
   "Returns the first item of coll for which (pred item) returns logical true.\nConsumes sequences up to the first match, will consume the entire sequence\nand return nil if no match is found.",
   :var-type "function",
   :line 85,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/seq/src/main/clojure/clojure/contrib/seq.clj"}
  {:arglists ([s]),
   :name "indexed",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj#L39",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/indexed",
   :doc
   "Returns a lazy sequence of [index, item] pairs, where items come\nfrom 's' and indexes count up from zero.\n\n(indexed '(a b c d))  =>  ([0 a] [1 b] [2 c] [3 d])",
   :var-type "function",
   :line 39,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/seq/src/main/clojure/clojure/contrib/seq.clj"}
  {:arglists ([pred coll]),
   :name "positions",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj#L129",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/positions",
   :doc
   "Returns a lazy sequence containing the positions at which pred\nis true for items in coll.",
   :var-type "function",
   :line 129,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/seq/src/main/clojure/clojure/contrib/seq.clj"}
  {:arglists ([binding-name & exprs]),
   :name "rec-cat",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj#L56",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/rec-cat",
   :doc
   "Similar to lazy-cat but binds the resulting sequence to the supplied \nbinding-name, allowing for recursive expressions.",
   :var-type "macro",
   :line 56,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/seq/src/main/clojure/clojure/contrib/seq.clj"}
  {:arglists ([binding-name & body]),
   :name "rec-seq",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj#L49",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/rec-seq",
   :doc
   "Similar to lazy-seq but binds the resulting seq to the supplied \nbinding-name, allowing for recursive expressions.",
   :var-type "macro",
   :line 49,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/seq/src/main/clojure/clojure/contrib/seq.clj"}
  {:arglists ([x]),
   :name "rotations",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj#L63",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/rotations",
   :doc "Returns a lazy seq of all rotations of a seq",
   :var-type "function",
   :line 63,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/seq/src/main/clojure/clojure/contrib/seq.clj"}
  {:arglists ([f s]),
   :name "separate",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj#L33",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/95353ce63392ee9e7df44c9082320bdc42401f76/modules/seq/src/main/clojure/clojure/contrib/seq.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/separate",
   :doc
   "Returns a vector:\n[ (filter f s), (filter (complement f) s) ]",
   :var-type "function",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/seq/src/main/clojure/clojure/contrib/seq.clj"}
  {:arglists ([port backlog bind-addr] [port backlog] [port]),
   :name "create-repl-server",
   :namespace "clojure.contrib.server-socket",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/server-socket/src/main/clojure/clojure/contrib/server_socket.clj#L87",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/server-socket/src/main/clojure/clojure/contrib/server_socket.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//server-socket-api.html#clojure.contrib.server-socket/create-repl-server",
   :doc "create a repl on a socket",
   :var-type "function",
   :line 87,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/server-socket/src/main/clojure/clojure/contrib/server_socket.clj"}
  {:arglists
   ([port fun backlog bind-addr] [port fun backlog] [port fun]),
   :name "create-server",
   :namespace "clojure.contrib.server-socket",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/server-socket/src/main/clojure/clojure/contrib/server_socket.clj#L53",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/server-socket/src/main/clojure/clojure/contrib/server_socket.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//server-socket-api.html#clojure.contrib.server-socket/create-server",
   :doc
   "Creates a server socket on port. Upon accept, a new thread is\ncreated which calls:\n\n(fun input-stream output-stream)\n\nOptional arguments support specifying a listen backlog and binding\nto a specific endpoint.",
   :var-type "function",
   :line 53,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/server-socket/src/main/clojure/clojure/contrib/server_socket.clj"}
  {:arglists ([set1 set2]),
   :name "proper-subset?",
   :namespace "clojure.contrib.set",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/set/src/main/clojure/clojure/contrib/set.clj#L24",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/set/src/main/clojure/clojure/contrib/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//set-api.html#clojure.contrib.set/proper-subset?",
   :doc "Is s1 a proper subset of s2?",
   :var-type "function",
   :line 24,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/set/src/main/clojure/clojure/contrib/set.clj"}
  {:arglists ([set1 set2]),
   :name "proper-superset?",
   :namespace "clojure.contrib.set",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/set/src/main/clojure/clojure/contrib/set.clj#L31",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/set/src/main/clojure/clojure/contrib/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//set-api.html#clojure.contrib.set/proper-superset?",
   :doc "Is s1 a proper superset of s2?",
   :var-type "function",
   :line 31,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/set/src/main/clojure/clojure/contrib/set.clj"}
  {:arglists ([f]),
   :name "global-singleton",
   :namespace "clojure.contrib.singleton",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/singleton/src/main/clojure/clojure/contrib/singleton.clj#L28",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/singleton/src/main/clojure/clojure/contrib/singleton.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//singleton-api.html#clojure.contrib.singleton/global-singleton",
   :doc
   "Returns a global singleton function.  f is a function of no\narguments that creates and returns some object.  The singleton\nfunction will call f just once, the first time it is needed, and\ncache the value for all subsequent calls.\n\nWarning: global singletons are often unsafe in multi-threaded code.\nConsider per-thread-singleton instead.",
   :var-type "function",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/singleton/src/main/clojure/clojure/contrib/singleton.clj"}
  {:arglists ([f]),
   :name "per-thread-singleton",
   :namespace "clojure.contrib.singleton",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/singleton/src/main/clojure/clojure/contrib/singleton.clj#L41",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/singleton/src/main/clojure/clojure/contrib/singleton.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//singleton-api.html#clojure.contrib.singleton/per-thread-singleton",
   :doc
   "Returns a per-thread singleton function.  f is a function of no\narguments that creates and returns some object.  The singleton\nfunction will call f only once for each thread, and cache its value\nfor subsequent calls from the same thread.  This allows you to\nsafely and lazily initialize shared objects on a per-thread basis.\n\nWarning: due to a bug in JDK 5, it may not be safe to use a\nper-thread-singleton in the initialization function for another\nper-thread-singleton.  See\nhttp://bugs.sun.com/bugdatabase/view_bug.do?bug_id=5025230",
   :var-type "function",
   :line 41,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/singleton/src/main/clojure/clojure/contrib/singleton.clj"}
  {:arglists ([]),
   :name "connection",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L28",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/connection",
   :doc
   "Returns the current database connection (or throws if there is none)",
   :var-type "function",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([name & specs]),
   :name "create-table",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L107",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/create-table",
   :doc
   "Creates a table on the open database connection given a table name and\nspecs. Each spec is either a column spec: a vector containing a column\nname and optionally a type and other constraints, or a table-level\nconstraint: a vector containing words that express the constraint. All\nwords used to describe the table may be supplied as strings or keywords.",
   :var-type "function",
   :line 107,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([table where-params]),
   :name "delete-rows",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L161",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/delete-rows",
   :doc
   "Deletes rows from a table. where-params is a vector containing a string\nproviding the (optionally parameterized) selection criteria followed by\nvalues for any parameters.",
   :var-type "function",
   :line 161,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([& commands]),
   :name "do-commands",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L79",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/do-commands",
   :doc "Executes SQL commands on the open database connection.",
   :var-type "function",
   :line 79,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([sql & param-groups]),
   :name "do-prepared",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L88",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/do-prepared",
   :doc
   "Executes an (optionally parameterized) SQL prepared statement on the\nopen database connection. Each param-group is a seq of values for all of\nthe parameters.",
   :var-type "function",
   :line 88,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([name]),
   :name "drop-table",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L123",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/drop-table",
   :doc
   "Drops a table on the open database connection given its name, a string\nor keyword",
   :var-type "function",
   :line 123,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([]),
   :name "find-connection",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L27",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/find-connection",
   :doc
   "Returns the current database connection (or nil if there is none)",
   :var-type "function",
   :line 27,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([table & records]),
   :name "insert-records",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L154",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/insert-records",
   :doc
   "Inserts records into a table. records are maps from strings or\nkeywords (identifying columns) to values.",
   :var-type "function",
   :line 154,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([table & rows]),
   :name "insert-rows",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L148",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/insert-rows",
   :doc
   "Inserts complete rows into a table. Each row is a vector of values for\neach of the table's columns in order.",
   :var-type "function",
   :line 148,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([table column-names & value-groups]),
   :name "insert-values",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L130",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/insert-values",
   :doc
   "Inserts rows into a table with values for specified columns only.\ncolumn-names is a vector of strings or keywords identifying columns. Each\nvalue-group is a vector containing a values for each column in\norder. When inserting complete rows (all columns), consider using\ninsert-rows instead.",
   :var-type "function",
   :line 130,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([]),
   :name "is-rollback-only",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L73",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/is-rollback-only",
   :doc
   "Returns true if the outermost transaction will rollback rather than\ncommit when complete",
   :var-type "function",
   :line 73,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([]),
   :name "set-rollback-only",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L67",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/set-rollback-only",
   :doc
   "Marks the outermost transaction such that it will rollback rather than\ncommit when complete",
   :var-type "function",
   :line 67,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([& body]),
   :name "transaction",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L56",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/transaction",
   :doc
   "Evaluates body as a transaction on the open database connection. Any\nnested transactions are absorbed into the outermost transaction. By\ndefault, all database updates are committed together as a group after\nevaluating the outermost body, or rolled back on any uncaught\nexception. If set-rollback-only is called within scope of the outermost\ntransaction, the entire transaction will be rolled back rather than\ncommitted when complete.",
   :var-type "macro",
   :line 56,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([table where-params record]),
   :name "update-or-insert-values",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L186",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/update-or-insert-values",
   :doc
   "Updates values on selected rows in a table, or inserts a new row when no\nexisting row matches the selection criteria. where-params is a vector\ncontaining a string providing the (optionally parameterized) selection\ncriteria followed by values for any parameters. record is a map from\nstrings or keywords (identifying columns) to updated values.",
   :var-type "function",
   :line 186,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([table where-params record]),
   :name "update-values",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L172",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/update-values",
   :doc
   "Updates values on selected rows in a table. where-params is a vector\ncontaining a string providing the (optionally parameterized) selection\ncriteria followed by values for any parameters. record is a map from\nstrings or keywords (identifying columns) to updated values.",
   :var-type "function",
   :line 172,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([db-spec & body]),
   :name "with-connection",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L30",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/with-connection",
   :doc
   "Evaluates body in the context of a new connection to a database then\ncloses the connection. db-spec is a map containing values for one of the\nfollowing parameter sets:\n\nFactory:\n  :factory     (required) a function of one argument, a map of params\n  (others)     (optional) passed to the factory function in a map\n\nDriverManager:\n  :classname   (required) a String, the jdbc driver class name\n  :subprotocol (required) a String, the jdbc subprotocol\n  :subname     (required) a String, the jdbc subname\n  (others)     (optional) passed to the driver as properties.\n\nDataSource:\n  :datasource  (required) a javax.sql.DataSource\n  :username    (optional) a String\n  :password    (optional) a String, required if :username is supplied\n\nJNDI:\n  :name        (required) a String or javax.naming.Name\n  :environment (optional) a java.util.Map",
   :var-type "macro",
   :line 30,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([results sql-params & body]),
   :name "with-query-results",
   :namespace "clojure.contrib.sql",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj#L199",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/8bb336e9160e58cf411ce249cb6acd9a34106287/modules/sql/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/with-query-results",
   :doc
   "Executes a query, then evaluates body with results bound to a seq of the\nresults. sql-params is a vector containing a string providing\nthe (optionally parameterized) SQL query followed by values for any\nparameters.",
   :var-type "macro",
   :line 199,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql.clj"}
  {:arglists ([name args streams & body]),
   :name "defst",
   :namespace "clojure.contrib.stream-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj#L183",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/defst",
   :doc
   "Define the stream transformer name by body.\nThe non-stream arguments args and the stream arguments streams\nare given separately, with args being possibly empty.",
   :var-type "macro",
   :line 183,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj"}
  {:arglists ([type-tag args & body]),
   :name "defstream",
   :namespace "clojure.contrib.stream-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj#L73",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/defstream",
   :doc
   "Define object of the given type as a stream whose implementation\nof stream-next is defined by args and body. This macro adds\na type-specific method for stream-next and derives type\nfrom stream-type.",
   :var-type "macro",
   :line 73,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj"}
  {:arglists ([n]),
   :name "pick",
   :namespace "clojure.contrib.stream-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj#L149",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/pick",
   :doc
   "Return the next value of stream argument n inside a stream\ntransformer. When used inside of defst, the name of the stream\nargument can be used instead of its index n.",
   :var-type "function",
   :line 149,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj"}
  {:arglists ([streams]),
   :name "pick-all",
   :namespace "clojure.contrib.stream-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj#L160",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/pick-all",
   :doc
   "Return a vector containing the next value of each stream argument\ninside a stream transformer.",
   :var-type "function",
   :line 160,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj"}
  {:arglists ([n stream]),
   :name "stream-drop",
   :namespace "clojure.contrib.stream-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj#L201",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/stream-drop",
   :doc
   "Return a stream containing all but the first n elements of stream.",
   :var-type "function",
   :line 201,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj"}
  {:arglists ([s]),
   :name "stream-flatten",
   :namespace "clojure.contrib.stream-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj#L271",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/stream-flatten",
   :doc
   "Converts a stream of sequences into a stream of the elements of the\nsequences. Flattening is not recursive, only one level of nesting\nwill be removed.",
   :var-type "function",
   :line 271,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj#L135",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/stream-m",
   :namespace "clojure.contrib.stream-utils",
   :line 135,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj",
   :var-type "var",
   :doc
   "Monad describing stream computations. The monadic values can be\nof any type handled by stream-next.",
   :name "stream-m"}
  {:arglists ([s]),
   :name "stream-seq",
   :namespace "clojure.contrib.stream-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj#L113",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/stream-seq",
   :doc
   "Return a lazy seq on the stream. Also accessible via\nclojure.contrib.seq/seq-on and\nclojure.contrib.generic.collection/seq for streams.",
   :var-type "function",
   :line 113,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj#L69",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/stream-type",
   :namespace "clojure.contrib.stream-utils",
   :line 69,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/stream-utils/src/main/clojure/clojure/contrib/stream_utils.clj",
   :var-type "var",
   :doc
   "The root type for the stream hierarchy. For each stream type,\nadd a derivation from this type.",
   :name "stream-type"}
  {:arglists ([string]),
   :name "<<",
   :namespace "clojure.contrib.strint",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/strint/src/main/clojure/clojure/contrib/strint.clj#L49",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/strint/src/main/clojure/clojure/contrib/strint.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//strint-api.html#clojure.contrib.strint/<<",
   :doc
   "Takes a single string argument and emits a str invocation that concatenates\nthe string data and evaluated expressions contained within that argument.\nEvaluation is controlled using ~{} and ~() forms.  The former is used for\nsimple value replacement using clojure.core/str; the latter can be used to\nembed the results of arbitrary function invocation into the produced string.\n\nExamples:\nuser=> (def v 30.5)\n#'user/v\nuser=> (<< \"This trial required ~{v}ml of solution.\")\n\"This trial required 30.5ml of solution.\"\nuser=> (<< \"There are ~(int v) days in November.\")\n\"There are 30 days in November.\"\nuser=> (def m {:a [1 2 3]})\n#'user/m\nuser=> (<< \"The total for your order is $~(->> m :a (apply +)).\")\n\"The total for your order is $6.\"\n\nNote that quotes surrounding string literals within ~() forms must be\nescaped.",
   :var-type "macro",
   :line 49,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/strint/src/main/clojure/clojure/contrib/strint.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj#L70",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/action-translation-table",
   :namespace "clojure.contrib.swing-utils",
   :line 70,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj",
   :var-type "var",
   :doc "Translation table for the make-action constructor.",
   :name "action-translation-table"}
  {:arglists ([component f & args]),
   :name "add-action-listener",
   :namespace "clojure.contrib.swing-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj#L23",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/add-action-listener",
   :doc
   "Adds an ActionLister to component. When the action fires, f will be\ninvoked with the event as its first argument followed by args.\nReturns the listener.",
   :var-type "function",
   :line 23,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj"}
  {:arglists ([component f & args]),
   :name "add-key-typed-listener",
   :namespace "clojure.contrib.swing-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj#L33",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/add-key-typed-listener",
   :doc
   "Adds a KeyListener to component that only responds to KeyTyped events.\nWhen a key is typed, f is invoked with the KeyEvent as its first argument\nfollowed by args. Returns the listener.",
   :var-type "function",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj"}
  {:arglists ([& body]),
   :name "do-swing",
   :namespace "clojure.contrib.swing-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj#L58",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/do-swing",
   :doc
   "Executes body in the Swing event thread asynchronously. Returns\nimmediately after scheduling the execution.",
   :var-type "macro",
   :line 58,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj"}
  {:arglists ([schedule thunk]),
   :name "do-swing*",
   :namespace "clojure.contrib.swing-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj#L46",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/do-swing*",
   :doc
   "Runs thunk in the Swing event thread according to schedule:\n- :later => schedule the execution and return immediately\n- :now   => wait until the execution completes.",
   :var-type "function",
   :line 46,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj"}
  {:arglists ([& body]),
   :name "do-swing-and-wait",
   :namespace "clojure.contrib.swing-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj#L64",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/do-swing-and-wait",
   :doc
   "Executes body in the Swing event thread synchronously. Returns\nafter the execution is complete.",
   :var-type "macro",
   :line 64,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj"}
  {:arglists ([spec]),
   :name "make-action",
   :namespace "clojure.contrib.swing-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj#L80",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/make-action",
   :doc
   "Create an Action proxy from the given action spec. The standard keys\nrecognised are: :name, :accelerator, :command-key, :long-desc,\n:short-desc, :mnemonic and :icon - corresponding to the similar named\nAction properties.  The :handler value is used in the actionPerformed\nmethod of the proxy to pass on the event.",
   :var-type "function",
   :line 80,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj"}
  {:arglists ([menubar-items]),
   :name "make-menubar",
   :namespace "clojure.contrib.swing-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj#L142",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/make-menubar",
   :doc
   "Create a menubar containing the given sequence of menu items. The menu\nitems are described by a map as is detailed in the docstring of the\nadd-menu-item function.",
   :var-type "function",
   :line 142,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj"}
  {:raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj#L97",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/menu-constructor-dispatch",
   :namespace "clojure.contrib.swing-utils",
   :line 97,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/swing-utils/src/main/clojure/clojure/contrib/swing_utils.clj",
   :var-type "var",
   :doc
   "An atom containing the dispatch set for the add-menu-item method.",
   :name "menu-constructor-dispatch"}
  {:name "*trace-depth*",
   :namespace "clojure.contrib.trace",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj#L40",
   :dynamic true,
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/*trace-depth*",
   :doc "Current stack depth of traced function calls.",
   :var-type "var",
   :line 40,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/trace/src/main/clojure/clojure/contrib/trace.clj"}
  {:arglists ([name & definition]),
   :name "deftrace",
   :namespace "clojure.contrib.trace",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj#L75",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/deftrace",
   :doc
   "Use in place of defn; traces each call/return of this fn, including\narguments.  Nested calls to deftrace'd functions will print a\ntree-like structure.",
   :var-type "macro",
   :line 75,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/trace/src/main/clojure/clojure/contrib/trace.clj"}
  {:arglists ([fnames & exprs]),
   :name "dotrace",
   :namespace "clojure.contrib.trace",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj#L86",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/dotrace",
   :doc
   "Given a sequence of function identifiers, evaluate the body\nexpressions in an environment in which the identifiers are bound to\nthe traced functions.  Does not work on inlined functions,\nsuch as clojure.core/+",
   :var-type "macro",
   :line 86,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/trace/src/main/clojure/clojure/contrib/trace.clj"}
  {:arglists ([value] [name value]),
   :name "trace",
   :namespace "clojure.contrib.trace",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj#L50",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/trace",
   :doc
   "Sends name (optional) and value to the tracer function, then\nreturns value.  May be wrapped around any expression without\naffecting the result.",
   :var-type "function",
   :line 50,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/trace/src/main/clojure/clojure/contrib/trace.clj"}
  {:arglists ([name f args]),
   :name "trace-fn-call",
   :namespace "clojure.contrib.trace",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj#L64",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/trace-fn-call",
   :doc
   "Traces a single call to a function f with args.  'name' is the\nsymbol name of the function.",
   :var-type "function",
   :line 64,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/trace/src/main/clojure/clojure/contrib/trace.clj"}
  {:arglists ([]),
   :name "trace-indent",
   :namespace "clojure.contrib.trace",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj#L59",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/trace-indent",
   :doc "Returns an indentation string based on *trace-depth*",
   :var-type "function",
   :line 59,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/trace/src/main/clojure/clojure/contrib/trace.clj"}
  {:arglists ([name value]),
   :name "tracer",
   :namespace "clojure.contrib.trace",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj#L44",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/trace/src/main/clojure/clojure/contrib/trace.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/tracer",
   :doc
   "This function is called by trace.  Prints to standard output, but\nmay be rebound to do anything you like.  'name' is optional.",
   :var-type "function",
   :line 44,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/trace/src/main/clojure/clojure/contrib/trace.clj"}
  {:arglists ([type-tag & constructors]),
   :name "defadt",
   :namespace "clojure.contrib.types",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/types/src/main/clojure/clojure/contrib/types.clj#L128",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/types/src/main/clojure/clojure/contrib/types.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//types-api.html#clojure.contrib.types/defadt",
   :doc
   "Define an algebraic data type name by an exhaustive list of constructors.\nEach constructor can be a symbol (argument-free constructor) or a\nlist consisting of a tag symbol followed by the argument symbols.\nThe data type tag must be a keyword.",
   :var-type "macro",
   :line 128,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/types/src/main/clojure/clojure/contrib/types.clj"}
  {:arglists
   ([type-tag constructor-name docstring? attr-map?]
    [type-tag constructor-name docstring? attr-map? constructor]
    [type-tag
     constructor-name
     docstring?
     attr-map?
     constructor
     deconstructor]),
   :name "deftype",
   :namespace "clojure.contrib.types",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/types/src/main/clojure/clojure/contrib/types.clj#L54",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/types/src/main/clojure/clojure/contrib/types.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//types-api.html#clojure.contrib.types/deftype",
   :doc
   "Define a data type by a type tag (a namespace-qualified keyword)\nand a symbol naming the constructor function. Optionally, a\nconstructor and a deconstructor function can be given as well,\nthe defaults being clojure.core/identity and clojure.core/list.\nThe full constructor associated with constructor-name calls the\nconstructor function and attaches the type tag to its result\nas metadata. The deconstructor function must return the arguments\nto be passed to the constructor in order to create an equivalent\nobject. It is used for printing and matching.",
   :var-type "macro",
   :line 54,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/types/src/main/clojure/clojure/contrib/types.clj"}
  {:arglists ([type-tag constructor-name & optional]),
   :name "deftype-",
   :namespace "clojure.contrib.types",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/types/src/main/clojure/clojure/contrib/types.clj#L88",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/types/src/main/clojure/clojure/contrib/types.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//types-api.html#clojure.contrib.types/deftype-",
   :doc "Same as deftype but the constructor is private.",
   :var-type "macro",
   :line 88,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/types/src/main/clojure/clojure/contrib/types.clj"}
  {:arglists ([value & clauses]),
   :name "match",
   :namespace "clojure.contrib.types",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/types/src/main/clojure/clojure/contrib/types.clj#L241",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/types/src/main/clojure/clojure/contrib/types.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//types-api.html#clojure.contrib.types/match",
   :doc
   "Given a value and a list of template-expr clauses, evaluate the first\nexpr whose template matches the value. There are four kinds of templates:\n1) Lists of the form (tag x1 x2 ...) match instances of types\n   whose constructor has the same form as the list.\n2) Quoted lists of the form '(x1 x2 ...) match lists of the same\n   length.\n3) Vectors of the form [x1 x2 ...] match vectors of the same length.\n4) Maps of the form {:key1 x1 :key2 x2 ...} match maps that have\n   the same keys as the template, but which can have additional keys\n   that are not part of the template.\nThe values x1, x2, ... can be symbols or non-symbol values. Non-symbols\nmust be equal to the corresponding values in the object to be matched.\nSymbols will be bound to the corresponding value in the object in the\nevaluation of expr. If the same symbol occurs more than once in a,\ntemplate the corresponding elements of the object must be equal\nfor the template to match.",
   :var-type "macro",
   :line 241,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/types/src/main/clojure/clojure/contrib/types.clj"}
  {:arglists ([ns & body]),
   :name "with-ns",
   :namespace "clojure.contrib.with-ns",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/with-ns/src/main/clojure/clojure/contrib/with_ns.clj#L20",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/with-ns/src/main/clojure/clojure/contrib/with_ns.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//with-ns-api.html#clojure.contrib.with-ns/with-ns",
   :doc
   "Evaluates body in another namespace.  ns is either a namespace\nobject or a symbol.  This makes it possible to define functions in\nnamespaces other than the current one.",
   :var-type "macro",
   :line 20,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/with-ns/src/main/clojure/clojure/contrib/with_ns.clj"}
  {:arglists ([& body]),
   :name "with-temp-ns",
   :namespace "clojure.contrib.with-ns",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/with-ns/src/main/clojure/clojure/contrib/with_ns.clj#L28",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/with-ns/src/main/clojure/clojure/contrib/with_ns.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//with-ns-api.html#clojure.contrib.with-ns/with-temp-ns",
   :doc
   "Evaluates body in an anonymous namespace, which is then immediately\nremoved.  The temporary namespace will 'refer' clojure.core.",
   :var-type "macro",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/with-ns/src/main/clojure/clojure/contrib/with_ns.clj"}
  {:arglists ([loc]),
   :name "ancestors",
   :namespace "clojure.contrib.zip-filter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/zip_filter.clj#L65",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/zip_filter.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/ancestors",
   :doc
   "Returns a lazy sequence of all ancestors of location loc, starting\nwith loc and proceeding to loc's parent node and on through to the\nroot of the tree.",
   :var-type "function",
   :line 65,
   :file "clojure/contrib/zip_filter.clj"}
  {:arglists ([loc]),
   :name "children",
   :namespace "clojure.contrib.zip-filter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/zip_filter.clj#L45",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/zip_filter.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/children",
   :doc
   "Returns a lazy sequence of all immediate children of location loc,\nleft-to-right.",
   :var-type "function",
   :line 45,
   :file "clojure/contrib/zip_filter.clj"}
  {:arglists ([loc]),
   :name "children-auto",
   :namespace "clojure.contrib.zip-filter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/zip_filter.clj#L52",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/zip_filter.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/children-auto",
   :doc
   "Returns a lazy sequence of all immediate children of location loc,\nleft-to-right, marked so that a following tag= predicate will auto-descend.",
   :var-type "function",
   :line 52,
   :file "clojure/contrib/zip_filter.clj"}
  {:arglists ([loc]),
   :name "descendants",
   :namespace "clojure.contrib.zip-filter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/zip_filter.clj#L60",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/zip_filter.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/descendants",
   :doc
   "Returns a lazy sequence of all descendants of location loc, in\ndepth-first order, left-to-right, starting with loc.",
   :var-type "function",
   :line 60,
   :file "clojure/contrib/zip_filter.clj"}
  {:arglists ([loc]),
   :name "left-locs",
   :namespace "clojure.contrib.zip-filter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/zip_filter.clj#L33",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/zip_filter.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/left-locs",
   :doc
   "Returns a lazy sequence of locations to the left of loc, starting with loc.",
   :var-type "function",
   :line 33,
   :file "clojure/contrib/zip_filter.clj"}
  {:arglists ([loc]),
   :name "leftmost?",
   :namespace "clojure.contrib.zip-filter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/zip_filter.clj#L37",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/zip_filter.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/leftmost?",
   :doc
   "Returns true if there are no more nodes to the left of location loc.",
   :var-type "function",
   :line 37,
   :file "clojure/contrib/zip_filter.clj"}
  {:arglists ([loc]),
   :name "right-locs",
   :namespace "clojure.contrib.zip-filter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/zip_filter.clj#L29",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/zip_filter.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/right-locs",
   :doc
   "Returns a lazy sequence of locations to the right of loc, starting with loc.",
   :var-type "function",
   :line 29,
   :file "clojure/contrib/zip_filter.clj"}
  {:arglists ([loc]),
   :name "rightmost?",
   :namespace "clojure.contrib.zip-filter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/zip_filter.clj#L41",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/zip_filter.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/rightmost?",
   :doc
   "Returns true if there are no more nodes to the right of location loc.",
   :var-type "function",
   :line 41,
   :file "clojure/contrib/zip_filter.clj"}
  {:arglists ([condition]),
   :name "-init",
   :namespace "clojure.contrib.condition.Condition",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition/Condition.clj#L25",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition/Condition.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition.Condition/-init",
   :doc
   "Constructs a Condition object with condition (a map) as its\nmetadata. Also initializes the superclass with the values at :message\nand :cause, if any, so they are also available via .getMessage and\n.getCause.",
   :var-type "function",
   :line 25,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/condition/src/main/clojure/clojure/contrib/condition/Condition.clj"}
  {:arglists ([this]),
   :name "-meta",
   :namespace "clojure.contrib.condition.Condition",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition/Condition.clj#L40",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition/Condition.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition.Condition/-meta",
   :doc "Returns this object's metadata, the condition",
   :var-type "function",
   :line 40,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/condition/src/main/clojure/clojure/contrib/condition/Condition.clj"}
  {:arglists ([this condition]),
   :name "-post-init",
   :namespace "clojure.contrib.condition.Condition",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition/Condition.clj#L33",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/condition/src/main/clojure/clojure/contrib/condition/Condition.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition.Condition/-post-init",
   :doc
   "Adds :stack-trace to the condition. Drops the bottom 3 frames because\nthey are always the same: implementation details of Condition and raise.",
   :var-type "function",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/condition/src/main/clojure/clojure/contrib/condition/Condition.clj"}
  {:arglists ([db name key]),
   :name "add-index",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L86",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/add-index",
   :doc "Adds an index to an empty relation named name",
   :var-type "function",
   :line 86,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([db name keys]),
   :name "add-relation",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L81",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/add-relation",
   :doc "Adds a relation to the database",
   :var-type "function",
   :line 81,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([db rel-name tuple] [rel tuple]),
   :name "add-tuple",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L172",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/add-tuple",
   :doc
   "Two forms:\n\n[db relation-name tuple] adds tuple to the named relation.  Returns\nthe new database.\n\n[rel tuple] adds to the relation object.  Returns the new relation.",
   :var-type "function",
   :line 172,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([db & tupls]),
   :name "add-tuples",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L207",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/add-tuples",
   :doc
   "Adds a collection of tuples to the db, as\n(add-tuples db\n   [:rel-name :key-1 1 :key-2 2]\n   [:rel-name :key-1 2 :key-2 3])",
   :var-type "function",
   :line 207,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([db rn pt]),
   :name "any-match?",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L253",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/any-match?",
   :doc
   "Finds if there are any matching records for the partial tuple",
   :var-type "function",
   :line 253,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([db]),
   :name "database-counts",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L144",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/database-counts",
   :doc "Returns a map with the count of elements in each relation.",
   :var-type "function",
   :line 144,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([dbs]),
   :name "database-merge",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L277",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/database-merge",
   :doc "Merges databases together",
   :var-type "function",
   :line 277,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([dbs]),
   :name "database-merge-parallel",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L282",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/database-merge-parallel",
   :doc "Merges databases together in parallel",
   :var-type "function",
   :line 282,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([schema data indexes]),
   :name "datalog-relation",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L76",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/datalog-relation",
   :doc "Creates a relation",
   :var-type "function",
   :line 76,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([db name keys indexes]),
   :name "ensure-relation",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L96",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/ensure-relation",
   :doc "If the database lacks the named relation, add it",
   :var-type "function",
   :line 96,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([db rel-name]),
   :name "get-relation",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L130",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/get-relation",
   :doc "Get a relation object by name",
   :var-type "function",
   :line 130,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([& commands]),
   :name "make-database",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L109",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/make-database",
   :doc
   "Makes a database, like this\n(make-database\n  (relation :fred [:mary :sue])\n  (index :fred :mary)\n  (relation :sally [:jen :becky])\n  (index :sally :jen)\n  (index :sally :becky))",
   :var-type "macro",
   :line 109,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([r1 r2]),
   :name "merge-relations",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L267",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/merge-relations",
   :doc "Merges two relations",
   :var-type "function",
   :line 267,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([db rel-name tuple] [rel tuple]),
   :name "remove-tuple",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L190",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/remove-tuple",
   :doc
   "Two forms:\n\n[db relation-name tuple] removes the tuple from the named relation,\nreturns a new database.\n\n[rel tuple] removes the tuple from the relation.  Returns the new\nrelation.",
   :var-type "function",
   :line 190,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([db rel-name rel]),
   :name "replace-relation",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L135",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/replace-relation",
   :doc
   "Add or replace a fully constructed relation object to the database.",
   :var-type "function",
   :line 135,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([db rn pt]),
   :name "select",
   :namespace "clojure.contrib.datalog.database",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj#L248",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/select",
   :doc
   "finds all matching tuples to the partial tuple (pt) in the relation named (rn)",
   :var-type "function",
   :line 248,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/database.clj"}
  {:arglists ([f type]),
   :name "build-atom",
   :namespace "clojure.contrib.datalog.literals",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj#L131",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/build-atom",
   :doc
   "Returns an unevaluated expression (to be used in a macro) of an\natom.",
   :var-type "function",
   :line 131,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj"}
  {:arglists ([s]),
   :name "build-seed-bindings",
   :namespace "clojure.contrib.datalog.literals",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj#L301",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/build-seed-bindings",
   :doc
   "Given a seed literal, already adorned and in magic form, convert\nits bound constants to new variables.",
   :var-type "function",
   :line 301,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj"}
  {:arglists ([l]),
   :name "delta-literal",
   :namespace "clojure.contrib.datalog.literals",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj#L318",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/delta-literal",
   :doc "Given a literal l, return a delta version",
   :var-type "function",
   :line 318,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj"}
  {:arglists ([pred]),
   :name "get-adorned-bindings",
   :namespace "clojure.contrib.datalog.literals",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj#L269",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/get-adorned-bindings",
   :doc "Get the bindings from this adorned literal.",
   :var-type "function",
   :line 269,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj"}
  {:arglists ([pred]),
   :name "get-base-predicate",
   :namespace "clojure.contrib.datalog.literals",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj#L274",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/get-base-predicate",
   :doc "Get the base predicate from this predicate.",
   :var-type "function",
   :line 274,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj"}
  {:arglists ([lit]),
   :name "literal-magic?",
   :namespace "clojure.contrib.datalog.literals",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj#L294",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/literal-magic?",
   :doc "Is this literal magic?",
   :var-type "function",
   :line 294,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj"}
  {:arglists ([l]),
   :name "magic-literal",
   :namespace "clojure.contrib.datalog.literals",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj#L284",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/magic-literal",
   :doc "Create a magic version of this adorned predicate.",
   :var-type "function",
   :line 284,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj"}
  {:arglists ([l]),
   :name "negated-literal",
   :namespace "clojure.contrib.datalog.literals",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj#L312",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/negated-literal",
   :doc "Given a literal l, return a negated version",
   :var-type "function",
   :line 312,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj"}
  {:arglists ([l]),
   :name "negated?",
   :namespace "clojure.contrib.datalog.literals",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj#L110",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/negated?",
   :doc "Is this literal a negated literal?",
   :var-type "function",
   :line 110,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj"}
  {:arglists ([l]),
   :name "positive?",
   :namespace "clojure.contrib.datalog.literals",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj#L115",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/positive?",
   :doc "Is this a positive literal?",
   :var-type "function",
   :line 115,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj"}
  {:arglists ([db lit bs] [db lit bs var?]),
   :name "project-literal",
   :namespace "clojure.contrib.datalog.literals",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj#L391",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/project-literal",
   :doc
   "Project a stream of bindings onto a literal/relation. Returns a new\ndb.",
   :var-type "function",
   :line 391,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/literals.clj"}
  {:arglists ([q]),
   :name "adorn-query",
   :namespace "clojure.contrib.datalog.magic",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj#L26",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/adorn-query",
   :doc "Adorn a query",
   :var-type "function",
   :line 26,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj"}
  {:arglists ([rs q]),
   :name "adorn-rules-set",
   :namespace "clojure.contrib.datalog.magic",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj#L31",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/adorn-rules-set",
   :doc
   "Adorns the given rules-set for the given query.  (rs) is a\nrules-set, (q) is an adorned query.",
   :var-type "function",
   :line 31,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj"}
  {:arglists ([q bindings]),
   :name "build-partial-tuple",
   :namespace "clojure.contrib.datalog.magic",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj#L78",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/build-partial-tuple",
   :doc
   "Given a query and a set of bindings, build a partial tuple needed\nto extract the relation from the database.",
   :var-type "function",
   :line 78,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj"}
  {:arglists ([rs] [rs i-preds]),
   :name "magic-transform",
   :namespace "clojure.contrib.datalog.magic",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj#L98",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/magic-transform",
   :doc
   "Return a magic transformation of an adorned rules-set (rs).  The\n(i-preds) are the predicates of the intension database.  These\ndefault to the predicates within the rules-set.",
   :var-type "function",
   :line 98,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj"}
  {:arglists ([q]),
   :name "seed-predicate-for-insertion",
   :namespace "clojure.contrib.datalog.magic",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj#L90",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/seed-predicate-for-insertion",
   :doc
   "Given a query, return the predicate to use for database insertion.",
   :var-type "function",
   :line 90,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj"}
  {:arglists ([q]),
   :name "seed-relation",
   :namespace "clojure.contrib.datalog.magic",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj#L63",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/seed-relation",
   :doc
   "Given a magic form of a query, give back the literal form of its seed\nrelation",
   :var-type "function",
   :line 63,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj"}
  {:arglists ([q]),
   :name "seed-rule",
   :namespace "clojure.contrib.datalog.magic",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj#L71",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/seed-rule",
   :doc "Given an adorned query, give back its seed rule",
   :var-type "function",
   :line 71,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/magic.clj"}
  {:arglists ([hd & body]),
   :name "<-",
   :namespace "clojure.contrib.datalog.rules",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj#L66",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/<-",
   :doc
   "Build a datalog rule.  Like this:\n\n(<- (:head :x ?x :y ?y) (:body-1 :x ?x :y ?y) (:body-2 :z ?z) (not! :body-3 :x ?x) (if > ?y ?z))",
   :var-type "macro",
   :line 66,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj"}
  {:arglists ([& q]),
   :name "?-",
   :namespace "clojure.contrib.datalog.rules",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj#L84",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/?-",
   :doc "Define a datalog query",
   :var-type "macro",
   :line 84,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj"}
  {:arglists ([rs]),
   :name "all-predicates",
   :namespace "clojure.contrib.datalog.rules",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj#L161",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/all-predicates",
   :doc "Given a rules-set, return all defined predicates",
   :var-type "function",
   :line 161,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj"}
  {:arglists ([db rule] [db-1 db-2 rule]),
   :name "apply-rule",
   :namespace "clojure.contrib.datalog.rules",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj#L182",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/apply-rule",
   :doc
   "Apply the rule against db-1, adding the results to the appropriate\nrelation in db-2.  The relation will be created if needed.",
   :var-type "function",
   :line 182,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj"}
  {:arglists ([bindings i-preds rule]),
   :name "compute-sip",
   :namespace "clojure.contrib.datalog.rules",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj#L98",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/compute-sip",
   :doc
   "Given a set of bound column names, return an adorned sip for this\nrule.  A set of intensional predicates should be provided to\ndetermine what should be adorned.",
   :var-type "function",
   :line 98,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj"}
  {:arglists ([query]),
   :name "display-query",
   :namespace "clojure.contrib.datalog.rules",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj#L37",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/display-query",
   :doc "Return a query in a readable format.",
   :var-type "function",
   :line 37,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj"}
  {:arglists ([rule]),
   :name "display-rule",
   :namespace "clojure.contrib.datalog.rules",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj#L30",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/display-rule",
   :doc "Return the rule in a readable format.",
   :var-type "function",
   :line 30,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj"}
  {:arglists ([rule]),
   :name "is-safe?",
   :namespace "clojure.contrib.datalog.rules",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj#L45",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/is-safe?",
   :doc "Is the rule safe according to the datalog protocol?",
   :var-type "function",
   :line 45,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj"}
  {:arglists ([rs]),
   :name "make-rules-set",
   :namespace "clojure.contrib.datalog.rules",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj#L127",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/make-rules-set",
   :doc
   "Given an existing set of rules, make it a 'rules-set' for\nprinting.",
   :var-type "function",
   :line 127,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj"}
  {:arglists ([rs]),
   :name "non-base-rules",
   :namespace "clojure.contrib.datalog.rules",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj#L166",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/non-base-rules",
   :doc
   "Return a collection of rules that depend, somehow, on other rules",
   :var-type "function",
   :line 166,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj"}
  {:arglists ([rs]),
   :name "predicate-map",
   :namespace "clojure.contrib.datalog.rules",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj#L151",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/predicate-map",
   :doc
   "Given a rules-set, return a map of rules keyed by their predicates.\nEach value will be a set of rules.",
   :var-type "function",
   :line 151,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj"}
  {:arglists ([rule]),
   :name "return-rule-data",
   :namespace "clojure.contrib.datalog.rules",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj#L79",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/return-rule-data",
   :doc "Returns an untypted rule that will be fully printed",
   :var-type "function",
   :line 79,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj"}
  {:arglists ([& rules]),
   :name "rules-set",
   :namespace "clojure.contrib.datalog.rules",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj#L135",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/0f94c13af8becfa9eab18652572bab62fcb4c002/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/rules-set",
   :doc "Given a collection of rules return a rules set",
   :var-type "function",
   :line 135,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/rules.clj"}
  {:arglists ([rs q]),
   :name "build-soft-strat-work-plan",
   :namespace "clojure.contrib.datalog.softstrat",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/softstrat.clj#L115",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/softstrat.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.softstrat/build-soft-strat-work-plan",
   :doc "Return a work plan for the given rules-set and query",
   :var-type "function",
   :line 115,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/softstrat.clj"}
  {:arglists ([ws]),
   :name "get-all-relations",
   :namespace "clojure.contrib.datalog.softstrat",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/softstrat.clj#L121",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/softstrat.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.softstrat/get-all-relations",
   :doc "Return a set of all relation names defined in this workplan",
   :var-type "function",
   :line 121,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/softstrat.clj"}
  {:arglists ([sym]),
   :name "is-query-var?",
   :namespace "clojure.contrib.datalog.util",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj#L33",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/is-query-var?",
   :doc "Is this a query variable: e.g. a symbol prefixed with ??",
   :var-type "function",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj"}
  {:arglists ([sym]),
   :name "is-var?",
   :namespace "clojure.contrib.datalog.util",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj#L25",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/is-var?",
   :doc "Is this a logic variable: e.g. a symbol prefixed with a ?",
   :var-type "function",
   :line 25,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj"}
  {:arglists ([m ks]),
   :name "keys-to-vals",
   :namespace "clojure.contrib.datalog.util",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj#L49",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/keys-to-vals",
   :doc
   "Given a map and a collection of keys, return the collection of vals",
   :var-type "function",
   :line 49,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj"}
  {:arglists ([f hash]),
   :name "map-values",
   :namespace "clojure.contrib.datalog.util",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj#L41",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/map-values",
   :doc "Like map, but works over the values of a hash map",
   :var-type "function",
   :line 41,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj"}
  {:arglists ([f data]),
   :name "preduce",
   :namespace "clojure.contrib.datalog.util",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj#L62",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/preduce",
   :doc
   "Similar to merge-with, but the contents of each key are merged in\nparallel using f.\n\nf - a function of 2 arguments.\ndata - a collection of hashes.",
   :var-type "function",
   :line 62,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj"}
  {:arglists ([m]),
   :name "reverse-map",
   :namespace "clojure.contrib.datalog.util",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj#L54",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/reverse-map",
   :doc "Reverse the keys/values of a map",
   :var-type "function",
   :line 54,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj"}
  {:arglists ([& body]),
   :name "trace-datalog",
   :namespace "clojure.contrib.datalog.util",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj#L82",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/trace-datalog",
   :doc "If *test-datalog* is set to true, run the enclosed commands",
   :var-type "macro",
   :line 82,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/datalog/src/main/clojure/clojure/contrib/datalog/util.clj"}
  {:arglists ([container components]),
   :name "add-components",
   :namespace "clojure.contrib.miglayout.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj#L99",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/add-components",
   :doc "Adds components with constraints to a container",
   :var-type "function",
   :line 99,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj"}
  {:arglists ([x]),
   :name "component?",
   :namespace "clojure.contrib.miglayout.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj#L64",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/component?",
   :doc "Returns true if x is a java.awt.Component",
   :var-type "function",
   :line 64,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj"}
  {:arglists ([x]),
   :name "constraint?",
   :namespace "clojure.contrib.miglayout.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj#L69",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/constraint?",
   :doc "Returns true if x is not a keyword-item or component",
   :var-type "function",
   :line 69,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj"}
  {:arglists ([container layout column row components]),
   :name "do-layout",
   :namespace "clojure.contrib.miglayout.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj#L119",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/do-layout",
   :doc
   "Attaches a MigLayout layout manager to container and adds components\nwith constraints",
   :var-type "function",
   :line 119,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj"}
  {:arglists ([c]),
   :name "format-constraint",
   :namespace "clojure.contrib.miglayout.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj#L31",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/format-constraint",
   :doc
   "Returns a vector of vectors representing one or more constraints\nseparated by commas. Constraints may be specified in Clojure using\nstrings, keywords, vectors, maps, and/or sets.",
   :var-type "function",
   :line 31,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj"}
  {:arglists ([& constraints]),
   :name "format-constraints",
   :namespace "clojure.contrib.miglayout.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj#L52",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/format-constraints",
   :doc
   "Returns a string representing all the constraints for one keyword-item\nor component formatted for miglayout.",
   :var-type "function",
   :line 52,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj"}
  {:arglists ([container]),
   :name "get-components",
   :namespace "clojure.contrib.miglayout.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj#L114",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/get-components",
   :doc
   "Returns a map from id to component for all components with an id",
   :var-type "function",
   :line 114,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj"}
  {:arglists ([constraint]),
   :name "parse-component-constraint",
   :namespace "clojure.contrib.miglayout.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj#L93",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/parse-component-constraint",
   :doc "Parses a component constraint string returning a CC object",
   :var-type "function",
   :line 93,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj"}
  {:arglists ([& args]),
   :name "parse-item-constraints",
   :namespace "clojure.contrib.miglayout.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj#L76",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/fe4ed311166677cd571d23774171af1d830f7fc5/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/parse-item-constraints",
   :doc
   "Iterates over args and builds a map containing values associated with\n:keywords and :components. The value for :keywords is a map from keyword\nitems to constraints strings. The value for :components is a vector of\nvectors each associating a component with its constraints string.",
   :var-type "function",
   :line 76,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/miglayout/src/main/clojure/clojure/contrib/miglayout/internal.clj"}
  {:arglists ([val] [val expectation-hash]),
   :name "calls",
   :namespace "clojure.contrib.mock.test-adapter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L209",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/calls",
   :doc
   "Creates or associates to an existing expectation hash the :calls key with a\nfunction that will be called with the given arguments. The return value from\nthis function will be returned by the expected function. If both this\nand :returns are specified, the return value of :calls will have precedence.\nUsage:\n(calls some-fn expectation-hash?)",
   :var-type "function",
   :line 209,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([arg-pred-forms] [arg-pred-forms expectation-hash]),
   :name "has-args",
   :namespace "clojure.contrib.mock.test-adapter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L223",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/has-args",
   :doc
   "Creates or associates to an existing expectation hash the :has-args key with\na value corresponding to a function that will either return true if its\nargument expectations are met or throw an exception with the details of the\nfirst failed argument it encounters.\nOnly specify as many predicates as you are interested in verifying. The rest\nof the values are safely ignored.\nUsage:\n(has-args [arg-pred-1 arg-pred-2 ... arg-pred-n] expectation-hash?)",
   :var-type "macro",
   :line 223,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([fn-name args]),
   :name "has-matching-signature?",
   :namespace "clojure.contrib.mock.test-adapter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L102",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/has-matching-signature?",
   :doc
   "Calls no-matching-function-signature if no match is found for the given\nfunction. If no argslist meta data is available for the function, it is\nnot called.",
   :var-type "function",
   :line 102,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([arg-preds arg-pred-forms]),
   :name "make-arg-checker",
   :namespace "clojure.contrib.mock.test-adapter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L113",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/make-arg-checker",
   :doc
   "Creates the argument verifying function for a replaced dependency within\nthe expectation bound scope. These functions take the additional argument\nof the name of the replaced function, then the rest of their args. It is\ndesigned to be called from the mock function generated in the first argument\nof the mock info object created by make-mock.",
   :var-type "function",
   :line 113,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([pred pred-form]),
   :name "make-count-checker",
   :namespace "clojure.contrib.mock.test-adapter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L129",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/make-count-checker",
   :doc
   "creates the count checker that is invoked at the end of an expectation, after\nthe code under test has all been executed. The function returned takes the\nname of the associated dependency and the invocation count as arguments.",
   :var-type "function",
   :line 129,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([fn-name expectation-hash]),
   :name "make-mock",
   :namespace "clojure.contrib.mock.test-adapter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L138",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/make-mock",
   :doc
   "creates a vector containing the following information for the named function:\n1. dependent function replacement - verifies signature, calls arg checker\nincreases count, returns return value.\n2. an atom containing the invocation count\n3. the invocation count checker function\n4. a symbol of the name of the function being replaced.",
   :var-type "function",
   :line 138,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([fn-name expected actual msg]),
   :name "report-problem",
   :namespace "clojure.contrib.mock.test-adapter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/636381148b53424c0ea98f5983a2d1574451c6ee/modules/mock/src/main/clojure/clojure/contrib/mock/test_adapter.clj#L24",
   :dynamic true,
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/636381148b53424c0ea98f5983a2d1574451c6ee/modules/mock/src/main/clojure/clojure/contrib/mock/test_adapter.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/report-problem",
   :doc
   "This function is designed to be used in a binding macro to override\nthe report-problem function in clojure.contrib.mock. Instead of printing\nthe error to the console, the error is logged via clojure.test.",
   :var-type "function",
   :line 24,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/mock/src/main/clojure/clojure/contrib/mock/test_adapter.clj"}
  {:arglists ([val] [val expectation-hash]),
   :name "returns",
   :namespace "clojure.contrib.mock.test-adapter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L197",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/returns",
   :doc
   "Creates or associates to an existing expectation hash the :returns key with\na value to be returned by the expectation after a successful invocation\nmatching its expected arguments (if applicable).\nUsage:\n(returns ret-value expectation-hash?)",
   :var-type "function",
   :line 197,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([times-fn] [times-fn expectation-hash]),
   :name "times",
   :namespace "clojure.contrib.mock.test-adapter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L240",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/times",
   :doc
   "Creates or associates to an existing expectation hash the :times key with a\nvalue corresponding to a predicate function which expects an integer value.\nAlso, an integer can be specified, in which case the times will only be an\nexact match. The times check is called at the end of an expect expression to\nvalidate that an expected dependency function was called the expected\nnumber of times.\nUsage:\n(times n)\n(times #(> n %))\n(times n expectation-hash)",
   :var-type "macro",
   :line 240,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([mock-data]),
   :name "validate-counts",
   :namespace "clojure.contrib.mock.test-adapter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//modules/clojure/contrib/mock.clj#L163",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw//modules/clojure/contrib/mock.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/validate-counts",
   :doc
   "given the sequence of all mock data for the expectation, simply calls the\ncount checker for each dependency.",
   :var-type "function",
   :line 163,
   :file "clojure/contrib/mock.clj"}
  {:arglists ([]),
   :name "connection*",
   :namespace "clojure.contrib.sql.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj#L37",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/connection*",
   :doc
   "Returns the current database connection (or throws if there is none)",
   :var-type "function",
   :line 37,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj"}
  {:arglists ([]),
   :name "find-connection*",
   :namespace "clojure.contrib.sql.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj#L32",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/find-connection*",
   :doc
   "Returns the current database connection (or nil if there is none)",
   :var-type "function",
   :line 32,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj"}
  {:arglists
   ([{:keys
      [factory
       classname
       subprotocol
       subname
       datasource
       username
       password
       name
       environment],
      :as db-spec}]),
   :name "get-connection",
   :namespace "clojure.contrib.sql.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj#L66",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/get-connection",
   :doc
   "Creates a connection to a database. db-spec is a map containing values\nfor one of the following parameter sets:\n\nFactory:\n  :factory     (required) a function of one argument, a map of params\n  (others)     (optional) passed to the factory function in a map\n\nDriverManager:\n  :classname   (required) a String, the jdbc driver class name\n  :subprotocol (required) a String, the jdbc subprotocol\n  :subname     (required) a String, the jdbc subname\n  (others)     (optional) passed to the driver as properties.\n\nDataSource:\n  :datasource  (required) a javax.sql.DataSource\n  :username    (optional) a String\n  :password    (optional) a String, required if :username is supplied\n\nJNDI:\n  :name        (required) a String or javax.naming.Name\n  :environment (optional) a java.util.Map",
   :var-type "function",
   :line 66,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj"}
  {:arglists ([stream exception]),
   :name "print-sql-exception",
   :namespace "clojure.contrib.sql.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj#L122",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/print-sql-exception",
   :doc "Prints the contents of an SQLException to stream",
   :var-type "function",
   :line 122,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj"}
  {:arglists ([stream exception]),
   :name "print-sql-exception-chain",
   :namespace "clojure.contrib.sql.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj#L136",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/print-sql-exception-chain",
   :doc "Prints a chain of SQLExceptions to stream",
   :var-type "function",
   :line 136,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj"}
  {:arglists ([stream exception]),
   :name "print-update-counts",
   :namespace "clojure.contrib.sql.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj#L144",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/print-update-counts",
   :doc
   "Prints the update counts from a BatchUpdateException to stream",
   :var-type "function",
   :line 144,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj"}
  {:arglists ([] [val]),
   :name "rollback",
   :namespace "clojure.contrib.sql.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj#L43",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/rollback",
   :doc "Accessor for the rollback flag on the current connection",
   :var-type "function",
   :line 43,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj"}
  {:arglists ([e]),
   :name "throw-rollback",
   :namespace "clojure.contrib.sql.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj#L153",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/throw-rollback",
   :doc "Sets rollback and throws a wrapped exception",
   :var-type "function",
   :line 153,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj"}
  {:arglists ([func]),
   :name "transaction*",
   :namespace "clojure.contrib.sql.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj#L159",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/transaction*",
   :doc
   "Evaluates func as a transaction on the open database connection. Any\nnested transactions are absorbed into the outermost transaction. By\ndefault, all database updates are committed together as a group after\nevaluating the outermost body, or rolled back on any uncaught\nexception. If rollback is set within scope of the outermost transaction,\nthe entire transaction will be rolled back rather than committed when\ncomplete.",
   :var-type "function",
   :line 159,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj"}
  {:arglists ([db-spec func]),
   :name "with-connection*",
   :namespace "clojure.contrib.sql.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj#L113",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/with-connection*",
   :doc
   "Evaluates func in the context of a new connection to a database then\ncloses the connection.",
   :var-type "function",
   :line 113,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj"}
  {:arglists ([[sql & params :as sql-params] func]),
   :name "with-query-results*",
   :namespace "clojure.contrib.sql.internal",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj#L193",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/1be54b2f9bd3c9f35385a015b14fc93337bffcac/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/with-query-results*",
   :doc
   "Executes a query, then evaluates func passing in a seq of the results as\nan argument. The first argument is a vector containing the (optionally\nparameterized) sql query string followed by values for any parameters.",
   :var-type "function",
   :line 193,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/sql/src/main/clojure/clojure/contrib/sql/internal.clj"}
  {:arglists ([attrname] [loc attrname]),
   :name "attr",
   :namespace "clojure.contrib.zip-filter.xml",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L18",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/attr",
   :doc
   "Returns the xml attribute named attrname, of the xml node at location loc.",
   :var-type "function",
   :line 18,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj"}
  {:arglists ([attrname attrval]),
   :name "attr=",
   :namespace "clojure.contrib.zip-filter.xml",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L23",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/attr=",
   :doc
   "Returns a query predicate that matches a node when it has an\nattribute named attrname whose value is attrval.",
   :var-type "function",
   :line 23,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj"}
  {:arglists ([preds]),
   :name "seq-test",
   :namespace "clojure.contrib.zip-filter.xml",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L51",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/seq-test",
   :doc
   "Returns a query predicate that matches a node when its xml content\nmatches the query expresions given.",
   :var-type "function",
   :line 51,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj"}
  {:arglists ([tagname]),
   :name "tag=",
   :namespace "clojure.contrib.zip-filter.xml",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L28",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/tag=",
   :doc
   "Returns a query predicate that matches a node when its is a tag\nnamed tagname.",
   :var-type "function",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj"}
  {:arglists ([loc]),
   :name "text",
   :namespace "clojure.contrib.zip-filter.xml",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L38",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/text",
   :doc
   "Returns the textual contents of the given location, similar to\nxpaths's value-of",
   :var-type "function",
   :line 38,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj"}
  {:arglists ([s]),
   :name "text=",
   :namespace "clojure.contrib.zip-filter.xml",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L46",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/text=",
   :doc
   "Returns a query predicate that matches a node when its textual\ncontent equals s.",
   :var-type "function",
   :line 46,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj"}
  {:arglists ([loc & preds]),
   :name "xml->",
   :namespace "clojure.contrib.zip-filter.xml",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L57",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/xml->",
   :doc
   "The loc is passed to the first predicate.  If the predicate returns\na collection, each value of the collection is passed to the next\npredicate.  If it returns a location, the location is passed to the\nnext predicate.  If it returns true, the input location is passed to\nthe next predicate.  If it returns false or nil, the next predicate\nis not called.\n\nThis process is repeated, passing the processed results of each\npredicate to the next predicate.  xml-> returns the final sequence.\nThe entire chain is evaluated lazily.\n\nThere are also special predicates: keywords are converted to tag=,\nstrings to text=, and vectors to sub-queries that return true if\nthey match.\n\nSee the footer of zip-query.clj for examples.",
   :var-type "function",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj"}
  {:arglists ([loc & preds]),
   :name "xml1->",
   :namespace "clojure.contrib.zip-filter.xml",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L80",
   :raw-source-url
   "http://github.com/clojure/clojure-contrib/raw/a6a92b9b3d2bfd9a56e1e5e9cfba706d1aeeaae5/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/xml1->",
   :doc
   "Returns the first item from loc based on the query predicates\ngiven.  See xml->",
   :var-type "function",
   :line 80,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/modules/zip-filter/src/main/clojure/clojure/contrib/zip_filter/xml.clj"})}
