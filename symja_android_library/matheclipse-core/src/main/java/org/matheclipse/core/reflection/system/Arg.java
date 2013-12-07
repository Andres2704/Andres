package org.matheclipse.core.reflection.system;

import static org.matheclipse.core.expression.F.*;

import org.apache.commons.math3.fraction.BigFraction;
import org.matheclipse.core.eval.interfaces.AbstractTrigArg1;
import org.matheclipse.core.eval.interfaces.INumeric;
import org.matheclipse.core.eval.interfaces.ISignedNumberConstant;
import org.matheclipse.core.expression.ComplexNum;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.expression.Num;
import org.matheclipse.core.interfaces.IComplex;
import org.matheclipse.core.interfaces.IComplexNum;
import org.matheclipse.core.interfaces.IEvaluator;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISignedNumber;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.parser.client.SyntaxError;

/**
 * 
 * See <a href="http://en.wikipedia.org/wiki/Argument_%28complex_analysis%29">Wikipedia - Argument (complex_analysis)</a>
 * 
 */
public class Arg extends AbstractTrigArg1 implements INumeric {

	public Arg() {
	}

	@Override
	public IExpr evaluateArg1(final IExpr arg1) {
		if (arg1.isSignedNumber()) {
			final ISignedNumber in = (ISignedNumber) arg1;
			if (in.isNegative()) {
				return F.Pi;
			} else if (!in.equals(F.C0)) {
				return F.C0;
			}
		} else if (arg1.isComplexNumeric()) {
			final IComplexNum ic = (IComplexNum) arg1;
			// ic == ( x + I * y )
			return num(Math.atan2(ic.getImaginaryPart(), ic.getRealPart()));
		} else if (arg1.isComplex()) {
			final IComplex ic = (IComplex) arg1;
			// ic == ( x + I * y )
			BigFraction x = ic.getRealPart();
			BigFraction y = ic.getImaginaryPart();
			int xi = x.compareTo(BigFraction.ZERO);
			int yi = y.compareTo(BigFraction.ZERO);
			if (xi < 0) {
				// x < 0
				if (yi < 0) {
					// y < 0

					// -Pi + ArcTan(y/x)
					return Plus(Times(CN1, Pi), ArcTan(Divide(F.fraction(y), F.fraction(x))));
				} else {
					// y >= 0

					// Pi + ArcTan(y/x)
					return Plus(Pi, ArcTan(Divide(F.fraction(y), F.fraction(x))));
				}
			}
			if (xi > 0) {
				// ArcTan(y/x)
				return ArcTan(Divide(F.fraction(y), F.fraction(x)));
			}
			if (yi < 0) {
				// y < 0

				// -Pi/2 + ArcTan(x/y)
				return Plus(Times(CN1D2, Pi), ArcTan(Divide(F.fraction(x), F.fraction(y))));
			} else {
				if (yi > 0) {
					// y > 0

					// Pi/2 + ArcTan(x/y)
					return Plus(Times(C1D2, Pi), ArcTan(Divide(F.fraction(x), F.fraction(y))));
				}
			}
		}
		if (arg1.isConstant()) {
			ISymbol sym = (ISymbol) arg1;
			IEvaluator eval = sym.getEvaluator();
			if (eval instanceof ISignedNumberConstant) {
				double val = ((ISignedNumberConstant) eval).evalReal();
				if (val < 0.0) {
					return F.Pi;
				} else if (val > 0.0) {
					return F.C0;
				}
			}
		}
		return null;
	}

	@Override
	public IExpr numericEvalD1(final Num arg1) {
		final double d = arg1.getRealPart();
		if (d < 0) {
			return F.num(Math.PI);
		} else if (d > 0) {
			return F.CD0;
		}
		return null;
	}

	/**
	 * Evaluate this function for one double complex argument
	 * 
	 * @param arg1
	 *          a double complex number
	 * 
	 * @return
	 */
	public IExpr numericEvalDC1(final ComplexNum arg1) {
		return num(Math.atan2(arg1.getImaginaryPart(), arg1.getRealPart()));
	} 

	public double evalReal(final double[] stack, final int top, final int size) {
		if (size != 1) {
			throw new UnsupportedOperationException();
		}
		if (stack[top] < 0) {
			return Math.PI;
		} else if (stack[top] > 0) {
			return 0;
		}
		throw new UnsupportedOperationException();
	}

	@Override
	public void setUp(final ISymbol symbol) throws SyntaxError {
		symbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		super.setUp(symbol);
	}
}
