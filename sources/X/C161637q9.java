package X;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.Method;

/* renamed from: X.7q9  reason: invalid class name and case insensitive filesystem */
public class C161637q9 {
    public static String A00 = "0";
    public static C162227rU A01;
    public static final C158267jh A02 = C158267jh.A00;
    public static final Object A03 = AnonymousClass002.A0D();

    public static Task A00(Context context) {
        C162177rO.A03(context, "Context must not be null");
        C152017Xf r2 = new C152017Xf();
        if (A02()) {
            r2.A00((Object) null);
        } else {
            new Thread(new AnonymousClass8MF(context, 39, r2)).start();
        }
        return r2.A00;
    }

    @Deprecated
    public static void A01(Context context) {
        Throwable r1;
        synchronized (A03) {
            if (!A02()) {
                C162177rO.A03(context, "Context must not be null");
                Class<C161637q9> cls = C161637q9.class;
                ClassLoader classLoader = cls.getClassLoader();
                C162177rO.A02(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    C158267jh r7 = A02;
                    C162117rH.A03(context, 11925000);
                    C162227rU A04 = C162227rU.A04(context, C162227rU.A0A, "com.google.android.gms.cronet_dynamite");
                    Class<?> loadClass = A04.A00.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() != cls.getClassLoader()) {
                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                        Integer num = (Integer) method.invoke((Object) null, new Object[0]);
                        C162177rO.A02(num);
                        int intValue = num.intValue();
                        String str = (String) method2.invoke((Object) null, new Object[0]);
                        C162177rO.A02(str);
                        A00 = str;
                        if (3 > intValue) {
                            Intent A05 = r7.A05(context, "cr", 2);
                            if (A05 == null) {
                                Log.e("CronetProviderInstaller", "Unable to fetch error resolution intent");
                                r1 = new C143476yw(2);
                            } else {
                                String str2 = A00;
                                StringBuilder A0Y = AnonymousClass6CA.A0Y(AnonymousClass6C7.A06(str2) + 174);
                                A0Y.append("Google Play Services update is required. The API Level of the client is ");
                                A0Y.append(3);
                                A0Y.append(". The API Level of the implementation is ");
                                A0Y.append(intValue);
                                r1 = new AnonymousClass6QB(A05, AnonymousClass000.A0V(". The Cronet implementation version is ", str2, A0Y), 2);
                            }
                            throw r1;
                        }
                        A01 = A04;
                    } else {
                        Log.e("CronetProviderInstaller", "ImplVersion class is missing from Cronet module.");
                        throw new C143476yw(8);
                    }
                } catch (ClassNotFoundException e) {
                    Log.e("CronetProviderInstaller", "Cronet API is not available. Have you included all required dependencies?");
                    throw ((C143476yw) new C143476yw(10).initCause(e));
                } catch (C143666zH e2) {
                    Log.e("CronetProviderInstaller", "Unable to load Cronet module", e2);
                    throw ((C143476yw) new C143476yw(8).initCause(e2));
                } catch (Exception e3) {
                    Log.e("CronetProviderInstaller", "Unable to read Cronet version from the Cronet module ", e3);
                    throw ((C143476yw) new C143476yw(8).initCause(e3));
                }
            }
        }
    }

    public static boolean A02() {
        C162227rU r0;
        synchronized (A03) {
            r0 = A01;
        }
        return AnonymousClass000.A1W(r0);
    }
}
