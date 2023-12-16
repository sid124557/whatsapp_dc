package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.integrity.IntegrityServiceException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8Mi  reason: invalid class name and case insensitive filesystem */
public abstract class C172698Mi implements Runnable {
    public final C152017Xf A00;

    public final void run() {
        C152017Xf r2;
        Exception exc;
        try {
            if (this instanceof C129156Zl) {
                C129156Zl r5 = (C129156Zl) this;
                C158887ki r6 = r5.A01.A00;
                r6.A01 = (IInterface) r6.A07.Avt(r5.A00);
                C157897j6 r4 = r6.A06;
                r4.A02("linkToDeath", new Object[0]);
                try {
                    r6.A01.asBinder().linkToDeath(r6.A05, 0);
                } catch (RemoteException e) {
                    r4.A01("linkToDeath failed", e, new Object[0]);
                }
                r6.A02 = false;
                List<Runnable> list = r6.A0B;
                for (Runnable run : list) {
                    run.run();
                }
                list.clear();
            } else if (this instanceof C129166Zm) {
                C129166Zm r52 = (C129166Zm) this;
                C158887ki r62 = r52.A01;
                synchronized (r62.A08) {
                    try {
                        C152017Xf r22 = r52.A00;
                        r62.A0C.add(r22);
                        r22.A00.addOnCompleteListener(new AnonymousClass8BN(r22, r62));
                        if (r62.A0D.getAndIncrement() > 0) {
                            r62.A06.A02("Already connected to the service.", AnonymousClass4L0.A0U());
                        }
                        C172698Mi r42 = r52.A02;
                        if (r62.A01 == null && !r62.A02) {
                            C157897j6 r8 = r62.A06;
                            r8.A02("Initiate binding to the service.", new Object[0]);
                            List<C172698Mi> list2 = r62.A0B;
                            list2.add(r42);
                            C162707sc r43 = new C162707sc(r62);
                            r62.A00 = r43;
                            r62.A02 = true;
                            if (!r62.A03.bindService(r62.A04, r43, 1)) {
                                r8.A02("Failed to bind to the service.", new Object[0]);
                                r62.A02 = false;
                                for (C172698Mi A01 : list2) {
                                    A01.A01(new AnonymousClass8RL());
                                }
                                list2.clear();
                            }
                        } else if (r62.A02) {
                            r62.A06.A02("Waiting to bind to the service.", new Object[0]);
                            r62.A0B.add(r42);
                        } else {
                            r42.run();
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } else if (this instanceof AnonymousClass6Zk) {
                AnonymousClass6Zk r53 = (AnonymousClass6Zk) this;
                if (r53.A01 != 0) {
                    C158887ki r44 = ((C162707sc) r53.A00).A00;
                    r44.A06.A02("unlinkToDeath", new Object[0]);
                    r44.A01.asBinder().unlinkToDeath(r44.A05, 0);
                    r44.A01 = null;
                    r44.A02 = false;
                    return;
                }
                C158887ki r54 = (C158887ki) r53.A00;
                synchronized (r54.A08) {
                    try {
                        AtomicInteger atomicInteger = r54.A0D;
                        if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() <= 0) {
                            if (r54.A01 != null) {
                                r54.A06.A02("Unbind from service.", new Object[0]);
                                r54.A03.unbindService(r54.A00);
                                r54.A02 = false;
                                r54.A01 = null;
                                r54.A00 = null;
                            }
                            r54.A01();
                        } else {
                            r54.A06.A02("Leaving the connection open for other ongoing calls.", new Object[0]);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } else if (this instanceof C129186Zo) {
                C129186Zo r55 = (C129186Zo) this;
                try {
                    AnonymousClass7K2 r9 = r55.A02;
                    String str = r55.A03;
                    long j = r55.A00;
                    Bundle A08 = AnonymousClass002.A08();
                    A08.putString("package.name", r9.A02);
                    A08.putLong("cloud.prj", 293955441834L);
                    A08.putString("nonce", str);
                    A08.putLong("warm.up.sid", j);
                    C163137tK r7 = (C163137tK) ((C187228wn) r9.A00.A01);
                    r7.A00(3, A00(A08, new C129126Zh(r55.A01, r9), r7));
                } catch (RemoteException e2) {
                    C157897j6 r3 = r55.A02.A01;
                    Object[] A0M = AnonymousClass002.A0M();
                    A0M[0] = r55.A03;
                    AnonymousClass001.A1Q(A0M, 293955441834L);
                    r3.A01("requestExpressIntegrityToken(%s, %s)", e2, A0M);
                    r2 = r55.A01;
                    exc = new AnonymousClass6QX(e2, -100);
                    r2.A01(exc);
                }
            } else if (this instanceof C129176Zn) {
                C129176Zn r56 = (C129176Zn) this;
                try {
                    AnonymousClass7K2 r72 = r56.A01;
                    Bundle A082 = AnonymousClass002.A08();
                    A082.putString("package.name", r72.A02);
                    A082.putLong("cloud.prj", 293955441834L);
                    ArrayList A0s = AnonymousClass001.A0s();
                    A0s.add(new C129116Zg(4, System.currentTimeMillis()));
                    A082.putParcelableArrayList("event_timestamps", AnonymousClass002.A0J(C1447072p.A00(A0s)));
                    C163137tK r63 = (C163137tK) ((C187228wn) r72.A00.A01);
                    r63.A00(2, A00(A082, new C129136Zi(r56.A00, r72), r63));
                } catch (RemoteException e3) {
                    C157897j6 r32 = r56.A01.A01;
                    Object[] A0L = AnonymousClass002.A0L();
                    C18280x3.A1S(A0L, 293955441834L);
                    r32.A01("warmUpIntegrityToken(%s)", e3, A0L);
                    r2 = r56.A00;
                    exc = new AnonymousClass6QX(e3, -100);
                    r2.A01(exc);
                }
            } else {
                C129196Zp r57 = (C129196Zp) this;
                try {
                    AnonymousClass7K1 r73 = r57.A02;
                    C187238wo r45 = (C187238wo) r73.A00.A01;
                    byte[] bArr = r57.A04;
                    Long l = r57.A03;
                    Bundle A083 = AnonymousClass002.A08();
                    A083.putString("package.name", r73.A02);
                    A083.putByteArray("nonce", bArr);
                    A083.putInt("playcore.integrity.version.major", 1);
                    A083.putInt("playcore.integrity.version.minor", 1);
                    A083.putInt("playcore.integrity.version.patch", 0);
                    if (l != null) {
                        A083.putLong("cloud.prj", l.longValue());
                    }
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    A0s2.add(new C129116Zg(3, System.currentTimeMillis()));
                    A083.putParcelableArrayList("event_timestamps", AnonymousClass002.A0J(C1447072p.A00(A0s2)));
                    C163137tK r46 = (C163137tK) r45;
                    r46.A00(2, A00(A083, new C129106Zf(r57.A00, r73), r46));
                } catch (RemoteException e4) {
                    C157897j6 r33 = r57.A02.A01;
                    Object[] A0L2 = AnonymousClass002.A0L();
                    A0L2[0] = r57.A01;
                    r33.A01("requestIntegrityToken(%s)", e4, A0L2);
                    r2 = r57.A00;
                    exc = new IntegrityServiceException(e4, -100);
                    r2.A01(exc);
                }
            }
        } catch (Exception e5) {
            A01(e5);
        }
    }

    public void A01(Exception exc) {
        C152017Xf r0 = this.A00;
        if (r0 != null) {
            r0.A01(exc);
        }
    }

    public C172698Mi(C152017Xf r1) {
        this.A00 = r1;
    }

    public static Parcel A00(Bundle bundle, IBinder iBinder, C163137tK r4) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r4.A01);
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(iBinder);
        return obtain;
    }

    public C172698Mi() {
        this.A00 = null;
    }
}
