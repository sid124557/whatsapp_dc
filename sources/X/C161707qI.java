package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7qI  reason: invalid class name and case insensitive filesystem */
public abstract class C161707qI {
    public static Context A06;
    public static final Object A07 = AnonymousClass002.A0D();
    public static volatile Boolean A08;
    public final C148837Jx A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public volatile SharedPreferences A04;
    public volatile C157667ig A05 = null;

    public static void A01(Context context) {
        Context applicationContext;
        if (A06 == null) {
            synchronized (A07) {
                if ((Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) && (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                if (A06 != context) {
                    A08 = null;
                }
                A06 = context;
            }
        }
    }

    public static boolean A02() {
        String str;
        if (A08 == null) {
            Context context = A06;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (Binder.getCallingPid() == Process.myPid()) {
                str = context.getPackageName();
            } else {
                str = null;
            }
            if (AnonymousClass0RT.A00(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", str, Binder.getCallingPid(), Binder.getCallingUid()) == 0) {
                z = true;
            }
            A08 = Boolean.valueOf(z);
        }
        return A08.booleanValue();
    }

    public final Object A03() {
        String str;
        if (A06 != null) {
            Object A042 = A04();
            if (A042 == null && (!A02() || (str = (String) A00(new AnonymousClass8AL(this))) == null || (A042 = A05(str)) == null)) {
                return this.A01;
            }
            return A042;
        }
        throw AnonymousClass001.A0e("Must call PhenotypeFlag.init() first");
    }

    public final Object A04() {
        boolean z;
        if (A02()) {
            z = AnonymousClass001.A1Z(A00(new AnonymousClass8AM("gms:phenotype:phenotype_flag:debug_bypass_phenotype")));
        } else {
            z = false;
        }
        if (!z) {
            Uri uri = this.A00.A00;
            if (uri != null) {
                if (this.A05 == null) {
                    ContentResolver contentResolver = A06.getContentResolver();
                    ConcurrentHashMap concurrentHashMap = C157667ig.A07;
                    C157667ig r3 = (C157667ig) concurrentHashMap.get(uri);
                    if (r3 == null) {
                        r3 = new C157667ig(contentResolver, uri);
                        C157667ig r0 = (C157667ig) concurrentHashMap.putIfAbsent(uri, r3);
                        if (r0 == null) {
                            r3.A00.registerContentObserver(r3.A02, false, r3.A01);
                        } else {
                            r3 = r0;
                        }
                    }
                    this.A05 = r3;
                }
                String str = (String) A00(new AnonymousClass8AN(this.A05, this));
                if (str != null) {
                    return A05(str);
                }
            }
        } else {
            String valueOf = String.valueOf(this.A02);
            Log.w("PhenotypeFlag", AnonymousClass6C7.A0k("Bypass reading Phenotype values for flag: ", valueOf, valueOf.length()));
        }
        return null;
    }

    public Object A05(String str) {
        Object obj;
        C140566tx r1;
        C140566tx r12;
        if (this instanceof AnonymousClass6VZ) {
            AnonymousClass6VZ r2 = (AnonymousClass6VZ) this;
            try {
                synchronized (r2.A02) {
                    if (!str.equals(r2.A01)) {
                        byte[] decode = Base64.decode(str, 3);
                        C128166Va r8 = (C128166Va) C128396Vx.zzbir.A06(4);
                        try {
                            C157367iB r5 = C157367iB.A02;
                            Class<?> cls = r8.getClass();
                            r5.A00(cls).BtQ(new C148847Jy(), r8, decode, 0, decode.length);
                            r5.A00(cls).Btp(r8);
                            if (r8.zzex == 0) {
                                byte byteValue = ((Byte) r8.A06(1)).byteValue();
                                if (byteValue != 1) {
                                    if (byteValue != 0) {
                                        boolean BuI = r5.A00(cls).BuI(r8);
                                        r8.A06(2);
                                        if (BuI) {
                                        }
                                    }
                                    r12 = new C140566tx(new AnonymousClass8RQ().getMessage());
                                    r12.zzkw = r8;
                                    r1 = r12;
                                    throw r1;
                                }
                                r2.A01 = str;
                                r2.A00 = (C128396Vx) r8;
                            } else {
                                throw new RuntimeException();
                            }
                        } catch (IOException e) {
                            if (e.getCause() instanceof C140566tx) {
                                r1 = e.getCause();
                            } else {
                                r12 = new C140566tx(e.getMessage());
                            }
                        } catch (IndexOutOfBoundsException unused) {
                            r12 = new C140566tx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    }
                    obj = r2.A00;
                }
                return obj;
            } catch (IOException | IllegalArgumentException unused2) {
                String str2 = r2.A02;
                StringBuilder A0q = AnonymousClass6C7.A0q(str, AnonymousClass6C7.A06(str2) + 27);
                A0q.append("Invalid byte[] value for ");
                A0q.append(str2);
                A0q.append(": ");
                AnonymousClass000.A1D(str, "PhenotypeFlag", A0q);
                return null;
            }
        } else if (this instanceof AnonymousClass6VY) {
            return str;
        } else {
            if (C18280x3.A1X(str, C161237pH.A0B)) {
                return Boolean.TRUE;
            }
            if (C18280x3.A1X(str, C161237pH.A0C)) {
                return Boolean.FALSE;
            }
            String str3 = this.A02;
            StringBuilder A0q2 = AnonymousClass6C7.A0q(str, AnonymousClass6C7.A06(str3) + 28);
            A0q2.append("Invalid boolean value for ");
            A0q2.append(str3);
            Log.e("PhenotypeFlag", AnonymousClass000.A0V(": ", str, A0q2));
            return null;
        }
    }

    public C161707qI(C148837Jx r2, Object obj, String str) {
        if (r2.A00 != null) {
            this.A00 = r2;
            this.A03 = AnonymousClass6C7.A0j(String.valueOf(r2.A01), str);
            this.A02 = AnonymousClass6C7.A0j(String.valueOf(r2.A02), str);
            this.A01 = obj;
            return;
        }
        throw AnonymousClass001.A0c("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static Object A00(C180968lv r3) {
        long clearCallingIdentity;
        try {
            return r3.BuJ();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object BuJ = r3.BuJ();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return BuJ;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
