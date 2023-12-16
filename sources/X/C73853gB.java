package X;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.3gB  reason: invalid class name and case insensitive filesystem */
public abstract class C73853gB extends C72473dm implements AnonymousClass4GY {
    public static final C73863gC A00 = new C73863gC();

    public C85484Gk get(C834148h r4) {
        C85484Gk r1 = this;
        C162457s7.A0J(r4, 1);
        if (r4 instanceof C72503dp) {
            C72503dp r42 = (C72503dp) r4;
            C834148h r12 = this.key;
            C162457s7.A0J(r12, 0);
            if ((r12 == r42 || r42.A00 == r12) && (r1 = (C85484Gk) r42.A01.invoke(this)) != null) {
                return r1;
            }
            return null;
        } else if (AnonymousClass4GY.A00 != r4) {
            return null;
        }
        return r1;
    }

    public C85494Gl minusKey(C834148h r4) {
        C162457s7.A0J(r4, 1);
        if (r4 instanceof C72503dp) {
            C72503dp r42 = (C72503dp) r4;
            C834148h r1 = this.key;
            C162457s7.A0J(r1, 0);
            if (!(r1 == r42 || r42.A00 == r1) || r42.A01.invoke(this) == null) {
                return this;
            }
        } else if (AnonymousClass4GY.A00 != r4) {
            return this;
        }
        return C72553du.A00;
    }

    public C73853gB() {
        super(AnonymousClass4GY.A00);
    }

    public C73853gB A00(int i) {
        if (this instanceof AnonymousClass46C) {
            AnonymousClass2AR.A00(i);
            if (i >= AnonymousClass2CC.A02) {
                return this;
            }
            AnonymousClass2AR.A00(i);
            return new AnonymousClass46E(this, i);
        } else if (this instanceof AnonymousClass46N) {
            AnonymousClass2AR.A00(i);
            if (i >= AnonymousClass2CC.A01) {
                return this;
            }
            AnonymousClass2AR.A00(i);
            return new AnonymousClass46E(this, i);
        } else if (this instanceof AnonymousClass46O) {
            return AnonymousClass46C.A00.A00(i);
        } else {
            if (this instanceof AnonymousClass46E) {
                AnonymousClass46E r1 = (AnonymousClass46E) this;
                AnonymousClass2AR.A00(i);
                if (i >= r1.A00) {
                    return r1;
                }
                AnonymousClass2AR.A00(i);
                return new AnonymousClass46E(r1, i);
            } else if (this instanceof AnonymousClass46D) {
                throw AnonymousClass002.A0G("limitedParallelism is not supported for Dispatchers.Unconfined");
            } else if (this instanceof AnonymousClass46A) {
                AnonymousClass46A r12 = (AnonymousClass46A) this;
                if (r12 instanceof C831546i) {
                    ((C831546i) r12).A05();
                    throw AnonymousClass000.A0L();
                }
                AnonymousClass2AR.A00(i);
                return r12;
            } else if (this instanceof AnonymousClass46B) {
                AnonymousClass2AR.A00(i);
                return this;
            } else {
                AnonymousClass2AR.A00(i);
                return new AnonymousClass46E(this, i);
            }
        }
    }

    public void A01(Runnable runnable, C85494Gl r6) {
        C73853gB r0;
        Runnable A04;
        if (this instanceof AnonymousClass46C) {
            AnonymousClass46N r02 = AnonymousClass46N.A01;
            r02.A00.A02(runnable, AnonymousClass2CC.A06, false);
        } else if (this instanceof AnonymousClass46E) {
            AnonymousClass46E r3 = (AnonymousClass46E) this;
            r3.A03.A03(runnable);
            if (AnonymousClass46E.A05.get(r3) < r3.A00 && r3.A05() && (A04 = r3.A04()) != null) {
                r3.A02.A01(new C70163a3(r3, 12, A04), r3);
            }
        } else if (this instanceof C831546i) {
            ((C831546i) this).A05();
            throw AnonymousClass000.A0L();
        } else if (this instanceof C831346g) {
            C831346g r1 = (C831346g) this;
            if (!r1.A00.post(runnable)) {
                r1.A05(runnable, r6);
            }
        } else if (this instanceof AnonymousClass46D) {
            C73843gA r12 = (C73843gA) r6.get(C73843gA.A01);
            if (r12 != null) {
                r12.A00 = true;
                return;
            }
            throw AnonymousClass002.A0G("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        } else if (this instanceof AnonymousClass46N) {
            ((AnonymousClass46N) this).A00.A02(runnable, AnonymousClass2CC.A07, false);
        } else {
            if (this instanceof AnonymousClass46O) {
                r0 = AnonymousClass46O.A00;
            } else if (this instanceof AnonymousClass46P) {
                try {
                    ((AnonymousClass46P) this).A00.execute(runnable);
                    return;
                } catch (RejectedExecutionException e) {
                    CancellationException cancellationException = new CancellationException("The task was rejected");
                    cancellationException.initCause(e);
                    C85474Gj A0v = C18310x6.A0v(r6);
                    if (A0v != null) {
                        A0v.AyX(cancellationException);
                    }
                    r0 = AnonymousClass34M.A01;
                }
            } else {
                ((AnonymousClass46L) this).A0B(runnable);
                return;
            }
            r0.A01(runnable, r6);
        }
    }

    public void A02(Runnable runnable, C85494Gl r6) {
        Runnable A04;
        if (this instanceof AnonymousClass46C) {
            AnonymousClass46N r0 = AnonymousClass46N.A01;
            r0.A00.A02(runnable, AnonymousClass2CC.A06, true);
        } else if (this instanceof AnonymousClass46N) {
            ((AnonymousClass46N) this).A00.A02(runnable, AnonymousClass2CC.A07, true);
        } else if (this instanceof AnonymousClass46O) {
            AnonymousClass46O.A00.A02(runnable, r6);
        } else if (this instanceof AnonymousClass46E) {
            AnonymousClass46E r3 = (AnonymousClass46E) this;
            r3.A03.A03(runnable);
            if (AnonymousClass46E.A05.get(r3) < r3.A00 && r3.A05() && (A04 = r3.A04()) != null) {
                r3.A02.A02(new C70163a3(r3, 12, A04), r3);
            }
        } else {
            A01(runnable, r6);
        }
    }

    public boolean A03(C85494Gl r4) {
        if (this instanceof C831546i) {
            ((C831546i) this).A05();
            throw AnonymousClass000.A0L();
        }
        if (this instanceof C831346g) {
            C831346g r2 = (C831346g) this;
            if (!r2.A02 || !C162457s7.A0P(Looper.myLooper(), r2.A00.getLooper())) {
                return true;
            }
            return false;
        } else if (this instanceof AnonymousClass46D) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1A(this, A0o);
        C18270x1.A18(this, A0o, '@');
        return A0o.toString();
    }
}
