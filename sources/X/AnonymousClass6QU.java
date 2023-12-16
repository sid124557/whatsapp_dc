package X;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: X.6QU  reason: invalid class name */
public abstract class AnonymousClass6QU extends AnonymousClass72G {
    @Deprecated
    public C187688xe A00(Context context, Looper looper, C187778xn r17, C187788xo r18, AnonymousClass7P4 r19, Object obj) {
        Object obj2 = obj;
        Context context2 = context;
        Looper looper2 = looper;
        C187778xn r4 = r17;
        C187788xo r5 = r18;
        AnonymousClass7P4 r6 = r19;
        if (this instanceof AnonymousClass6QT) {
            return new AnonymousClass6RY(context2, looper2, r4, r5, r6);
        }
        if (this instanceof AnonymousClass6QS) {
            throw null;
        } else if (this instanceof AnonymousClass6QR) {
            return new AnonymousClass6RZ(context2, AnonymousClass6RZ.A00(r6), looper2, r4, r5, r6);
        } else {
            if (this instanceof AnonymousClass6QQ) {
                return new AnonymousClass6RL(context2, looper2, r4, r5, r6);
            }
            if (this instanceof AnonymousClass6QP) {
                return new AnonymousClass6RX(context2, looper2, r4, r5, r6);
            }
            if (this instanceof AnonymousClass6QO) {
                return new AnonymousClass6RR(context2, looper2, r4, r5, r6);
            }
            if (this instanceof AnonymousClass6QN) {
                return new AnonymousClass6RN(context2, looper2, r4, r5, r6);
            }
            if (this instanceof AnonymousClass6QH) {
                return new AnonymousClass6RJ(context2, looper2, r4, r5, r6);
            }
            if (this instanceof AnonymousClass6QF) {
                return new AnonymousClass6RO(context, looper2, (GoogleSignInOptions) obj2, r4, r5, r6);
            } else if (this instanceof AnonymousClass6QE) {
                return new AnonymousClass6RK(context, looper2, (AnonymousClass895) obj2, r4, r5, r6);
            } else if (this instanceof AnonymousClass6QC) {
                return new AnonymousClass6RP(context, looper2, (AnonymousClass894) obj2, r4, r5, r6);
            } else if (this instanceof AnonymousClass6QM) {
                return new AnonymousClass6RQ(context2, looper2, r4, r5, r6);
            } else {
                if (this instanceof AnonymousClass6QL) {
                    return new AnonymousClass6RU(context2, looper2, r4, r5, r6);
                }
                if (this instanceof AnonymousClass6QK) {
                    return new AnonymousClass6RV(context2, looper2, r4, r5, r6);
                }
                if (this instanceof AnonymousClass6QJ) {
                    return new AnonymousClass6RW(context2, looper2, r4, r5, r6);
                }
                if (this instanceof AnonymousClass6QI) {
                    return new AnonymousClass6RS(context2, looper2, r4, r5, r6, (AnonymousClass890) obj2);
                }
                if (this instanceof AnonymousClass6QG) {
                    return new AnonymousClass6RT(context, looper2, (AnonymousClass893) obj2, r4, r5, r6);
                } else if (this instanceof AnonymousClass6QD) {
                    return new AnonymousClass6RM(context2, looper2, r4, r5, r6);
                } else {
                    throw AnonymousClass002.A0G("buildClient must be implemented");
                }
            }
        }
    }
}
