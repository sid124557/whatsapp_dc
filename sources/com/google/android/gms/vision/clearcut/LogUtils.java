package com.google.android.gms.vision.clearcut;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass6C9;
import X.AnonymousClass6XT;
import X.AnonymousClass6XW;
import X.AnonymousClass7BQ;
import X.AnonymousClass8T4;
import X.C127846Tn;
import X.C128676Xa;
import X.C128696Xc;
import X.C128706Xd;
import X.C128756Xi;
import X.C128766Xj;
import X.C1445872d;
import X.C159987mq;
import X.C169798Ar;
import X.C188238yZ;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;

public class LogUtils {
    public static String zzb(Context context) {
        try {
            AnonymousClass7BQ A00 = C159987mq.A00(context);
            return A00.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = context.getPackageName();
            C1445872d.A00("Unable to find calling package info for %s", e, A0L);
            return null;
        }
    }

    public static C128706Xd zza(long j, int i, String str, String str2, List list, C127846Tn r12) {
        AnonymousClass6XT r3 = (AnonymousClass6XT) C128676Xa.zzg.A09(5);
        AnonymousClass6XT r5 = (AnonymousClass6XT) C128756Xi.zzl.A09(5);
        AnonymousClass6XT.A00(r5);
        C128756Xi r1 = (C128756Xi) r5.A00;
        str2.getClass();
        r1.zzc |= 1;
        r1.zzd = str2;
        AnonymousClass6XT.A00(r5);
        C128756Xi r4 = (C128756Xi) r5.A00;
        int i2 = r4.zzc | 16;
        r4.zzc = i2;
        r4.zzi = j;
        r4.zzc = i2 | 32;
        r4.zzj = (long) i;
        C188238yZ r13 = r4.zzk;
        if (!((AnonymousClass8T4) r13).A00) {
            r13 = r13.BtF(AnonymousClass6C9.A0E(r13));
            r4.zzk = r13;
        }
        C169798Ar.A09(list, r13);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(r5.A01());
        AnonymousClass6XT.A00(r3);
        C128676Xa r2 = (C128676Xa) r3.A00;
        C188238yZ r14 = r2.zzf;
        if (!((AnonymousClass8T4) r14).A00) {
            r14 = r14.BtF(AnonymousClass6C9.A0E(r14));
            r2.zzf = r14;
        }
        C169798Ar.A09(A0s, r14);
        AnonymousClass6XT A01 = C128766Xj.A01(C128696Xc.zzi);
        AnonymousClass6XT.A00(A01);
        C128696Xc r52 = (C128696Xc) A01.A00;
        int i3 = r52.zzc | 4;
        r52.zzc = i3;
        r52.zzf = (long) r12.A01;
        int i4 = i3 | 2;
        r52.zzc = i4;
        r52.zze = (long) r12.A00;
        long j2 = (long) r12.A02;
        int i5 = i4 | 8;
        r52.zzc = i5;
        r52.zzg = j2;
        long j3 = r12.A04;
        r52.zzc = i5 | 16;
        r52.zzh = j3;
        C128696Xc r0 = (C128696Xc) A01.A01();
        AnonymousClass6XT.A00(r3);
        C128676Xa r15 = (C128676Xa) r3.A00;
        r0.getClass();
        r15.zzd = r0;
        r15.zzc |= 1;
        C128676Xa r32 = (C128676Xa) r3.A01();
        AnonymousClass6XT A012 = C128766Xj.A01(C128706Xd.zzi);
        AnonymousClass6XT.A00(A012);
        C128706Xd r16 = (C128706Xd) A012.A00;
        r32.getClass();
        r16.zzf = r32;
        r16.zzc |= 4;
        return (C128706Xd) A012.A01();
    }

    public static AnonymousClass6XW zza(Context context) {
        AnonymousClass6XT A01 = C128766Xj.A01(AnonymousClass6XW.zzf);
        String packageName = context.getPackageName();
        AnonymousClass6XT.A00(A01);
        AnonymousClass6XW r1 = (AnonymousClass6XW) A01.A00;
        packageName.getClass();
        r1.zzc |= 1;
        r1.zzd = packageName;
        String zzb = zzb(context);
        if (zzb != null) {
            AnonymousClass6XT.A00(A01);
            AnonymousClass6XW r12 = (AnonymousClass6XW) A01.A00;
            r12.zzc |= 2;
            r12.zze = zzb;
        }
        return (AnonymousClass6XW) A01.A01();
    }
}
