package X;

import android.database.Cursor;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Va  reason: invalid class name and case insensitive filesystem */
public class C194909Va {
    public final C56612sH A00;
    public final C56922sm A01;
    public final C49472ga A02;
    public final AnonymousClass35R A03;
    public final C72303dV A04;
    public final C55832qz A05;

    public List A03(C95814uZ r2) {
        return A05(r2, 4);
    }

    public List A04(C95814uZ r2) {
        return A05(r2, 6);
    }

    public final List A05(C95814uZ r12, int i) {
        Cursor A0E;
        C626936e.A00();
        AnonymousClass4GK A032 = this.A04.get();
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                A0E = ((AnonymousClass3H0) A032).A03.A0E(AnonymousClass9M8.A01, "GET_INTERACTIVE_MESSAGES_BY_CHAT_JID", new String[]{Integer.toString(i), Long.toString(this.A01.A07(r12)), Long.toString(System.currentTimeMillis() - 2419200000L)});
                C196049aD r1 = new C196049aD(this, r12);
                ArrayList A0s = AnonymousClass001.A0s();
                if (A0E != null) {
                    while (A0E.moveToNext()) {
                        Object apply = r1.apply(A0E);
                        if (apply != null) {
                            A0s.add(apply);
                        }
                    }
                }
                if (A0E != null) {
                    A0E.close();
                }
                this.A02.A02("OrderMessageManager/getInteractiveMessages", SystemClock.uptimeMillis() - uptimeMillis);
                return A0s;
            } catch (Throwable th) {
                this.A02.A02("OrderMessageManager/getInteractiveMessages", SystemClock.uptimeMillis() - uptimeMillis);
                throw th;
            }
            throw th;
        } finally {
            try {
                A032.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public C194909Va(C56612sH r1, C56922sm r2, C49472ga r3, AnonymousClass35R r4, C72303dV r5, C55832qz r6) {
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public C30791n7 A00(String str) {
        Throwable th;
        C30791n7 r0;
        C626936e.A00();
        AnonymousClass35R r02 = this.A03;
        C626936e.A00();
        AnonymousClass4GK A032 = r02.A01.get();
        try {
            Cursor A0E = ((AnonymousClass3H0) A032).A03.A0E(AnonymousClass9M8.A02, "GET_CHECKOUT_MESSAGES_BY_MESSAGE_ID", new String[]{str});
            A032.close();
            try {
                if (A0E.moveToNext()) {
                    r0 = (C30791n7) this.A05.A03(A0E);
                } else {
                    r0 = null;
                }
                A0E.close();
                return r0;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            A032.close();
            throw th;
        }
    }

    public List A01() {
        Throwable th;
        C626936e.A00();
        AnonymousClass35R r0 = this.A03;
        C626936e.A00();
        AnonymousClass4GK A032 = r0.A01.get();
        try {
            Cursor A0E = ((AnonymousClass3H0) A032).A03.A0E(AnonymousClass9M8.A00, "GET_CHECKOUT_MESSAGES", new String[]{Integer.toString(0), Integer.toString(1)});
            A032.close();
            try {
                C204769pt r2 = new C204769pt(this, 0);
                ArrayList A0s = AnonymousClass001.A0s();
                if (A0E != null) {
                    while (A0E.moveToNext()) {
                        Object apply = r2.apply(A0E);
                        if (apply != null) {
                            A0s.add(apply);
                        }
                    }
                }
                if (A0E != null) {
                    A0E.close();
                }
                return A0s;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            A032.close();
            throw th;
        }
    }

    public List A02() {
        Throwable th;
        C626936e.A00();
        AnonymousClass35R r0 = this.A03;
        C626936e.A00();
        AnonymousClass4GK A032 = r0.A01.get();
        try {
            Cursor A0E = ((AnonymousClass3H0) A032).A03.A0E(AnonymousClass9M8.A03, "GET_CHECKOUT_MESSAGES", (String[]) null);
            A032.close();
            try {
                C204769pt r2 = new C204769pt(this, 1);
                ArrayList A0s = AnonymousClass001.A0s();
                if (A0E != null) {
                    while (A0E.moveToNext()) {
                        Object apply = r2.apply(A0E);
                        if (apply != null) {
                            A0s.add(apply);
                        }
                    }
                }
                if (A0E != null) {
                    A0E.close();
                }
                return A0s;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            A032.close();
            throw th;
        }
    }
}
