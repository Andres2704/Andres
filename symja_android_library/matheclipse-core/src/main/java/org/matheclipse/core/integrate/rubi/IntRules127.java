package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules127 { 
  public static IAST RULES = List( 
IIntegrate(10261,Int(Erfi(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Erfi(Plus(a,Times(b,x))),Power(b,-1)),x),Negate(Simp(Times(Exp(Sqr(Plus(a,Times(b,x)))),Power(Times(b,Sqrt(Pi)),-1)),x))),FreeQ(List(a,b),x))),
IIntegrate(10262,Int(Sqr(Erf(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Sqr(Erf(Plus(a,Times(b,x)))),Power(b,-1)),x),Negate(Dist(Times(C4,Power(Pi,CN1D2)),Int(Times(Plus(a,Times(b,x)),Erf(Plus(a,Times(b,x))),Power(Exp(Sqr(Plus(a,Times(b,x)))),-1)),x),x))),FreeQ(List(a,b),x))),
IIntegrate(10263,Int(Sqr(Erfc(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Sqr(Erfc(Plus(a,Times(b,x)))),Power(b,-1)),x),Dist(Times(C4,Power(Pi,CN1D2)),Int(Times(Plus(a,Times(b,x)),Erfc(Plus(a,Times(b,x))),Power(Exp(Sqr(Plus(a,Times(b,x)))),-1)),x),x)),FreeQ(List(a,b),x))),
IIntegrate(10264,Int(Sqr(Erfi(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Sqr(Erfi(Plus(a,Times(b,x)))),Power(b,-1)),x),Negate(Dist(Times(C4,Power(Pi,CN1D2)),Int(Times(Plus(a,Times(b,x)),Exp(Sqr(Plus(a,Times(b,x)))),Erfi(Plus(a,Times(b,x)))),x),x))),FreeQ(List(a,b),x))),
IIntegrate(10265,Int(Times(Power(x_,-1),Erf(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Simp(Times(C2,b,x,HypergeometricPFQ(List(C1D2,C1D2),List(QQ(3L,2L),QQ(3L,2L)),Times(CN1,Sqr(b),Sqr(x))),Power(Pi,CN1D2)),x),FreeQ(b,x))),
IIntegrate(10266,Int(Times(Power(x_,-1),Erfc(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Simp(Log(x),x),Negate(Int(Times(Erf(Times(b,x)),Power(x,-1)),x))),FreeQ(b,x))),
IIntegrate(10267,Int(Times(Power(x_,-1),Erfi(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Simp(Times(C2,b,x,HypergeometricPFQ(List(C1D2,C1D2),List(QQ(3L,2L),QQ(3L,2L)),Times(Sqr(b),Sqr(x))),Power(Pi,CN1D2)),x),FreeQ(b,x))),
IIntegrate(10268,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Erf(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Erf(Plus(a,Times(b,x))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(C2,b,Power(Times(Sqrt(Pi),d,Plus(m,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Exp(Sqr(Plus(a,Times(b,x)))),-1)),x),x))),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1)))),
IIntegrate(10269,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Erfc(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Erfc(Plus(a,Times(b,x))),Power(Times(d,Plus(m,C1)),-1)),x),Dist(Times(C2,b,Power(Times(Sqrt(Pi),d,Plus(m,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Exp(Sqr(Plus(a,Times(b,x)))),-1)),x),x)),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1)))),
IIntegrate(10270,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Erfi(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Erfi(Plus(a,Times(b,x))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(C2,b,Power(Times(Sqrt(Pi),d,Plus(m,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Exp(Sqr(Plus(a,Times(b,x))))),x),x))),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1)))),
IIntegrate(10271,Int(Times(Power(x_,m_DEFAULT),Sqr(Erf(Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Sqr(Erf(Times(b,x))),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(C4,b,Power(Times(Sqrt(Pi),Plus(m,C1)),-1)),Int(Times(Power(x,Plus(m,C1)),Erf(Times(b,x)),Power(Exp(Times(Sqr(b),Sqr(x))),-1)),x),x))),And(FreeQ(b,x),Or(IGtQ(m,C0),ILtQ(Times(C1D2,Plus(m,C1)),C0))))),
IIntegrate(10272,Int(Times(Power(x_,m_DEFAULT),Sqr(Erfc(Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Sqr(Erfc(Times(b,x))),Power(Plus(m,C1),-1)),x),Dist(Times(C4,b,Power(Times(Sqrt(Pi),Plus(m,C1)),-1)),Int(Times(Power(x,Plus(m,C1)),Erfc(Times(b,x)),Power(Exp(Times(Sqr(b),Sqr(x))),-1)),x),x)),And(FreeQ(b,x),Or(IGtQ(m,C0),ILtQ(Times(C1D2,Plus(m,C1)),C0))))),
IIntegrate(10273,Int(Times(Power(x_,m_DEFAULT),Sqr(Erfi(Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Sqr(Erfi(Times(b,x))),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(C4,b,Power(Times(Sqrt(Pi),Plus(m,C1)),-1)),Int(Times(Power(x,Plus(m,C1)),Exp(Times(Sqr(b),Sqr(x))),Erfi(Times(b,x))),x),x))),And(FreeQ(b,x),Or(IGtQ(m,C0),ILtQ(Times(C1D2,Plus(m,C1)),C0))))),
IIntegrate(10274,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr(Erf(Plus(a_,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Dist(Power(Power(b,Plus(m,C1)),-1),Subst(Int(ExpandIntegrand(Sqr(Erf(x)),Power(Plus(Times(b,c),Times(CN1,a,d),Times(d,x)),m),x),x),x,Plus(a,Times(b,x))),x),And(FreeQ(List(a,b,c,d),x),IGtQ(m,C0)))),
IIntegrate(10275,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr(Erfc(Plus(a_,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Dist(Power(Power(b,Plus(m,C1)),-1),Subst(Int(ExpandIntegrand(Sqr(Erfc(x)),Power(Plus(Times(b,c),Times(CN1,a,d),Times(d,x)),m),x),x),x,Plus(a,Times(b,x))),x),And(FreeQ(List(a,b,c,d),x),IGtQ(m,C0)))),
IIntegrate(10276,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr(Erfi(Plus(a_,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Dist(Power(Power(b,Plus(m,C1)),-1),Subst(Int(ExpandIntegrand(Sqr(Erfi(x)),Power(Plus(Times(b,c),Times(CN1,a,d),Times(d,x)),m),x),x),x,Plus(a,Times(b,x))),x),And(FreeQ(List(a,b,c,d),x),IGtQ(m,C0)))),
IIntegrate(10277,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Power(Erf(Times(b_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Exp(c),Sqrt(Pi),Power(Times(C2,b),-1)),Subst(Int(Power(x,n),x),x,Erf(Times(b,x))),x),And(FreeQ(List(b,c,d,n),x),EqQ(d,Negate(Sqr(b)))))),
IIntegrate(10278,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Power(Erfc(Times(b_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Times(Exp(c),Sqrt(Pi),Power(Times(C2,b),-1)),Subst(Int(Power(x,n),x),x,Erfc(Times(b,x))),x)),And(FreeQ(List(b,c,d,n),x),EqQ(d,Negate(Sqr(b)))))),
IIntegrate(10279,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Power(Erfi(Times(b_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Exp(c),Sqrt(Pi),Power(Times(C2,b),-1)),Subst(Int(Power(x,n),x),x,Erfi(Times(b,x))),x),And(FreeQ(List(b,c,d,n),x),EqQ(d,Sqr(b))))),
IIntegrate(10280,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Erf(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Simp(Times(b,Exp(c),Sqr(x),HypergeometricPFQ(List(C1,C1),List(QQ(3L,2L),C2),Times(Sqr(b),Sqr(x))),Power(Pi,CN1D2)),x),And(FreeQ(List(b,c,d),x),EqQ(d,Sqr(b))))),
IIntegrate(10281,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Erfc(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Int(Exp(Plus(c,Times(d,Sqr(x)))),x),Negate(Int(Times(Exp(Plus(c,Times(d,Sqr(x)))),Erf(Times(b,x))),x))),And(FreeQ(List(b,c,d),x),EqQ(d,Sqr(b))))),
IIntegrate(10282,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Erfi(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Simp(Times(b,Exp(c),Sqr(x),HypergeometricPFQ(List(C1,C1),List(QQ(3L,2L),C2),Times(CN1,Sqr(b),Sqr(x))),Power(Pi,CN1D2)),x),And(FreeQ(List(b,c,d),x),EqQ(d,Negate(Sqr(b)))))),
IIntegrate(10283,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),x_,Erf(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Exp(Plus(c,Times(d,Sqr(x)))),Erf(Plus(a,Times(b,x))),Power(Times(C2,d),-1)),x),Negate(Dist(Times(b,Power(Times(d,Sqrt(Pi)),-1)),Int(Exp(Plus(Negate(Sqr(a)),c,Times(CN1,C2,a,b,x),Times(CN1,Plus(Sqr(b),Negate(d)),Sqr(x)))),x),x))),FreeQ(List(a,b,c,d),x))),
IIntegrate(10284,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),x_,Erfc(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Exp(Plus(c,Times(d,Sqr(x)))),Erfc(Plus(a,Times(b,x))),Power(Times(C2,d),-1)),x),Dist(Times(b,Power(Times(d,Sqrt(Pi)),-1)),Int(Exp(Plus(Negate(Sqr(a)),c,Times(CN1,C2,a,b,x),Times(CN1,Plus(Sqr(b),Negate(d)),Sqr(x)))),x),x)),FreeQ(List(a,b,c,d),x))),
IIntegrate(10285,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),x_,Erfi(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Exp(Plus(c,Times(d,Sqr(x)))),Erfi(Plus(a,Times(b,x))),Power(Times(C2,d),-1)),x),Negate(Dist(Times(b,Power(Times(d,Sqrt(Pi)),-1)),Int(Exp(Plus(Sqr(a),c,Times(C2,a,b,x),Times(Plus(Sqr(b),d),Sqr(x)))),x),x))),FreeQ(List(a,b,c,d),x))),
IIntegrate(10286,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Power(x_,m_),Erf(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,Negate(C1))),Exp(Plus(c,Times(d,Sqr(x)))),Erf(Plus(a,Times(b,x))),Power(Times(C2,d),-1)),x),Negate(Dist(Times(Plus(m,Negate(C1)),Power(Times(C2,d),-1)),Int(Times(Power(x,Plus(m,Negate(C2))),Exp(Plus(c,Times(d,Sqr(x)))),Erf(Plus(a,Times(b,x)))),x),x)),Negate(Dist(Times(b,Power(Times(d,Sqrt(Pi)),-1)),Int(Times(Power(x,Plus(m,Negate(C1))),Exp(Plus(Negate(Sqr(a)),c,Times(CN1,C2,a,b,x),Times(CN1,Plus(Sqr(b),Negate(d)),Sqr(x))))),x),x))),And(FreeQ(List(a,b,c,d),x),IGtQ(m,C1)))),
IIntegrate(10287,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Power(x_,m_),Erfc(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,Negate(C1))),Exp(Plus(c,Times(d,Sqr(x)))),Erfc(Plus(a,Times(b,x))),Power(Times(C2,d),-1)),x),Negate(Dist(Times(Plus(m,Negate(C1)),Power(Times(C2,d),-1)),Int(Times(Power(x,Plus(m,Negate(C2))),Exp(Plus(c,Times(d,Sqr(x)))),Erfc(Plus(a,Times(b,x)))),x),x)),Dist(Times(b,Power(Times(d,Sqrt(Pi)),-1)),Int(Times(Power(x,Plus(m,Negate(C1))),Exp(Plus(Negate(Sqr(a)),c,Times(CN1,C2,a,b,x),Times(CN1,Plus(Sqr(b),Negate(d)),Sqr(x))))),x),x)),And(FreeQ(List(a,b,c,d),x),IGtQ(m,C1)))),
IIntegrate(10288,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Power(x_,m_),Erfi(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,Negate(C1))),Exp(Plus(c,Times(d,Sqr(x)))),Erfi(Plus(a,Times(b,x))),Power(Times(C2,d),-1)),x),Negate(Dist(Times(Plus(m,Negate(C1)),Power(Times(C2,d),-1)),Int(Times(Power(x,Plus(m,Negate(C2))),Exp(Plus(c,Times(d,Sqr(x)))),Erfi(Plus(a,Times(b,x)))),x),x)),Negate(Dist(Times(b,Power(Times(d,Sqrt(Pi)),-1)),Int(Times(Power(x,Plus(m,Negate(C1))),Exp(Plus(Sqr(a),c,Times(C2,a,b,x),Times(Plus(Sqr(b),d),Sqr(x))))),x),x))),And(FreeQ(List(a,b,c,d),x),IGtQ(m,C1)))),
IIntegrate(10289,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Power(x_,-1),Erf(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Simp(Times(C2,b,Exp(c),x,HypergeometricPFQ(List(C1D2,C1),List(QQ(3L,2L),QQ(3L,2L)),Times(Sqr(b),Sqr(x))),Power(Pi,CN1D2)),x),And(FreeQ(List(b,c,d),x),EqQ(d,Sqr(b))))),
IIntegrate(10290,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Power(x_,-1),Erfc(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Int(Times(Exp(Plus(c,Times(d,Sqr(x)))),Power(x,-1)),x),Negate(Int(Times(Exp(Plus(c,Times(d,Sqr(x)))),Erf(Times(b,x)),Power(x,-1)),x))),And(FreeQ(List(b,c,d),x),EqQ(d,Sqr(b))))),
IIntegrate(10291,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Power(x_,-1),Erfi(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Simp(Times(C2,b,Exp(c),x,HypergeometricPFQ(List(C1D2,C1),List(QQ(3L,2L),QQ(3L,2L)),Times(CN1,Sqr(b),Sqr(x))),Power(Pi,CN1D2)),x),And(FreeQ(List(b,c,d),x),EqQ(d,Negate(Sqr(b)))))),
IIntegrate(10292,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Power(x_,m_),Erf(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Exp(Plus(c,Times(d,Sqr(x)))),Erf(Plus(a,Times(b,x))),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(C2,d,Power(Plus(m,C1),-1)),Int(Times(Power(x,Plus(m,C2)),Exp(Plus(c,Times(d,Sqr(x)))),Erf(Plus(a,Times(b,x)))),x),x)),Negate(Dist(Times(C2,b,Power(Times(Plus(m,C1),Sqrt(Pi)),-1)),Int(Times(Power(x,Plus(m,C1)),Exp(Plus(Negate(Sqr(a)),c,Times(CN1,C2,a,b,x),Times(CN1,Plus(Sqr(b),Negate(d)),Sqr(x))))),x),x))),And(FreeQ(List(a,b,c,d),x),ILtQ(m,CN1)))),
IIntegrate(10293,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Power(x_,m_),Erfc(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Exp(Plus(c,Times(d,Sqr(x)))),Erfc(Plus(a,Times(b,x))),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(C2,d,Power(Plus(m,C1),-1)),Int(Times(Power(x,Plus(m,C2)),Exp(Plus(c,Times(d,Sqr(x)))),Erfc(Plus(a,Times(b,x)))),x),x)),Dist(Times(C2,b,Power(Times(Plus(m,C1),Sqrt(Pi)),-1)),Int(Times(Power(x,Plus(m,C1)),Exp(Plus(Negate(Sqr(a)),c,Times(CN1,C2,a,b,x),Times(CN1,Plus(Sqr(b),Negate(d)),Sqr(x))))),x),x)),And(FreeQ(List(a,b,c,d),x),ILtQ(m,CN1)))),
IIntegrate(10294,Int(Times(Exp(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_)))),Power(x_,m_),Erfi(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Exp(Plus(c,Times(d,Sqr(x)))),Erfi(Plus(a,Times(b,x))),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(C2,d,Power(Plus(m,C1),-1)),Int(Times(Power(x,Plus(m,C2)),Exp(Plus(c,Times(d,Sqr(x)))),Erfi(Plus(a,Times(b,x)))),x),x)),Negate(Dist(Times(C2,b,Power(Times(Plus(m,C1),Sqrt(Pi)),-1)),Int(Times(Power(x,Plus(m,C1)),Exp(Plus(Sqr(a),c,Times(C2,a,b,x),Times(Plus(Sqr(b),d),Sqr(x))))),x),x))),And(FreeQ(List(a,b,c,d),x),ILtQ(m,CN1)))),
IIntegrate(10295,Int(Erf(Times(d_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))))),x_Symbol),
    Condition(Plus(Simp(Times(x,Erf(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))))),x),Negate(Dist(Times(C2,b,d,n,Power(Pi,CN1D2)),Int(Power(Exp(Sqr(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))))),-1),x),x))),FreeQ(List(a,b,c,d,n),x))),
IIntegrate(10296,Int(Erfc(Times(d_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))))),x_Symbol),
    Condition(Plus(Simp(Times(x,Erfc(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))))),x),Dist(Times(C2,b,d,n,Power(Pi,CN1D2)),Int(Power(Exp(Sqr(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))))),-1),x),x)),FreeQ(List(a,b,c,d,n),x))),
IIntegrate(10297,Int(Erfi(Times(d_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))))),x_Symbol),
    Condition(Plus(Simp(Times(x,Erfi(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))))),x),Negate(Dist(Times(C2,b,d,n,Power(Pi,CN1D2)),Int(Exp(Sqr(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))))),x),x))),FreeQ(List(a,b,c,d,n),x))),
IIntegrate(10298,Int(Times(Power(x_,-1),$(F_,Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),d_DEFAULT))),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(F(Times(d,Plus(a,Times(b,x)))),x,Log(Times(c,Power(x,n)))),x),And(FreeQ(List(a,b,c,d,n),x),MemberQ(List($s("Erf"),$s("Erfc"),$s("Erfi")),FSymbol))))
  );
}