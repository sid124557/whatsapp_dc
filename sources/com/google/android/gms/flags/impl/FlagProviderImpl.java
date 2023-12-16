package com.google.android.gms.flags.impl;

import X.AnonymousClass000;
import X.AnonymousClass6C7;
import X.AnonymousClass6CA;
import X.AnonymousClass6UT;
import X.AnonymousClass6WL;
import X.AnonymousClass8OT;
import X.AnonymousClass8OY;
import X.C117895sf;
import X.C117905sg;
import X.C117915sh;
import X.C124586Dc;
import X.C1441270d;
import X.C163187tP;
import X.C187078wT;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Callable;

public class FlagProviderImpl extends C124586Dc implements C187078wT {
    public boolean zzu;
    public SharedPreferences zzv;

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i != 1) {
            if (i == 2) {
                i3 = getBooleanFlagValue(parcel.readString(), AnonymousClass000.A1S(parcel.readInt()), parcel.readInt());
            } else if (i == 3) {
                i3 = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            } else if (i == 4) {
                long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(longFlagValue);
                return true;
            } else if (i != 5) {
                return false;
            } else {
                String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(stringFlagValue);
                return true;
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        init(AnonymousClass6WL.A02(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }

    public FlagProviderImpl(int i) {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static C187078wT asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof C187078wT) {
            return (C187078wT) queryLocalInterface;
        }
        return new C163187tP(iBinder);
    }

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        Boolean bool;
        if (!this.zzu) {
            return z;
        }
        SharedPreferences sharedPreferences = this.zzv;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            bool = (Boolean) A00(new C117895sf(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            String A0V = AnonymousClass6CA.A0V(e);
            Log.w("FlagDataUtils", AnonymousClass6C7.A0k("Flag value not available, returning default: ", A0V, A0V.length()));
            bool = valueOf;
        }
        return bool.booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        Integer num;
        if (!this.zzu) {
            return i;
        }
        SharedPreferences sharedPreferences = this.zzv;
        Integer valueOf = Integer.valueOf(i);
        try {
            num = (Integer) A00(new C117905sg(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            String A0V = AnonymousClass6CA.A0V(e);
            Log.w("FlagDataUtils", AnonymousClass6C7.A0k("Flag value not available, returning default: ", A0V, A0V.length()));
            num = valueOf;
        }
        return num.intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        Long l;
        if (!this.zzu) {
            return j;
        }
        SharedPreferences sharedPreferences = this.zzv;
        Long valueOf = Long.valueOf(j);
        try {
            l = (Long) A00(new C117915sh(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            String A0V = AnonymousClass6CA.A0V(e);
            Log.w("FlagDataUtils", AnonymousClass6C7.A0k("Flag value not available, returning default: ", A0V, A0V.length()));
            l = valueOf;
        }
        return l.longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.zzu) {
            return str2;
        }
        try {
            return (String) A00(new AnonymousClass8OY(this.zzv, str, str2));
        } catch (Exception e) {
            String A0V = AnonymousClass6CA.A0V(e);
            Log.w("FlagDataUtils", AnonymousClass6C7.A0k("Flag value not available, returning default: ", A0V, A0V.length()));
            return str2;
        }
    }

    /* JADX INFO: finally extract failed */
    public static Object A00(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    public void init(IObjectWrapper iObjectWrapper) {
        SharedPreferences sharedPreferences;
        Context context = (Context) AnonymousClass6UT.A01(iObjectWrapper);
        if (!this.zzu) {
            try {
                Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
                synchronized (SharedPreferences.class) {
                    sharedPreferences = C1441270d.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = (SharedPreferences) A00(new AnonymousClass8OT(createPackageContext));
                        C1441270d.A00 = sharedPreferences;
                    }
                }
                this.zzv = sharedPreferences;
                this.zzu = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e) {
                String A0V = AnonymousClass6CA.A0V(e);
                Log.w("FlagProviderImpl", AnonymousClass6C7.A0k("Could not retrieve sdk flags, continuing with defaults: ", A0V, A0V.length()));
            }
        }
    }

    public FlagProviderImpl() {
        super("com.google.android.gms.flags.IFlagProvider");
        this.zzu = false;
    }
}
