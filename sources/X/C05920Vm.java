package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Vm  reason: invalid class name and case insensitive filesystem */
public class C05920Vm {
    public final AnonymousClass0U1 A00;

    public AnonymousClass0U1 A00() {
        AnonymousClass0U1 r1 = this.A00;
        if (!TextUtils.isEmpty(r1.A0B)) {
            Intent[] intentArr = r1.A0P;
            if (intentArr != null && intentArr.length != 0) {
                return r1;
            }
            throw AnonymousClass001.A0c("Shortcut must have an intent");
        }
        throw AnonymousClass001.A0c("Shortcut must have a non-empty label");
    }

    public C05920Vm(Context context, ShortcutInfo shortcutInfo) {
        int i;
        C04440Of[] r7;
        AnonymousClass0U1 r5 = new AnonymousClass0U1();
        this.A00 = r5;
        r5.A05 = context;
        r5.A0D = shortcutInfo.getId();
        r5.A0E = shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        r5.A0P = (Intent[]) Arrays.copyOf(intents, intents.length);
        r5.A04 = shortcutInfo.getActivity();
        r5.A0B = shortcutInfo.getShortLabel();
        r5.A0C = shortcutInfo.getLongLabel();
        r5.A0A = shortcutInfo.getDisabledMessage();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            i = shortcutInfo.getDisabledReason();
        } else {
            i = 3;
            if (shortcutInfo.isEnabled()) {
                i = 0;
            }
        }
        r5.A00 = i;
        r5.A0F = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            r7 = null;
        } else {
            int i3 = extras.getInt("extraPersonCount");
            r7 = new C04440Of[i3];
            int i4 = 0;
            while (i4 < i3) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("extraPerson_");
                int i5 = i4 + 1;
                r7[i4] = AnonymousClass0RL.A01(extras.getPersistableBundle(AnonymousClass000.A0h(A0o, i5)));
                i4 = i5;
            }
        }
        r5.A0Q = r7;
        r5.A07 = shortcutInfo.getUserHandle();
        r5.A03 = shortcutInfo.getLastChangedTimestamp();
        if (i2 >= 30) {
            r5.A0I = shortcutInfo.isCached();
        }
        r5.A0K = shortcutInfo.isDynamic();
        r5.A0O = shortcutInfo.isPinned();
        r5.A0J = shortcutInfo.isDeclaredInManifest();
        r5.A0M = shortcutInfo.isImmutable();
        r5.A0L = shortcutInfo.isEnabled();
        r5.A0G = shortcutInfo.hasKeyFieldsOnly();
        r5.A08 = AnonymousClass0U1.A00(shortcutInfo);
        r5.A02 = shortcutInfo.getRank();
        r5.A06 = shortcutInfo.getExtras();
    }

    public C05920Vm(AnonymousClass0U1 r4) {
        AnonymousClass0U1 r2 = new AnonymousClass0U1();
        this.A00 = r2;
        r2.A05 = r4.A05;
        r2.A0D = r4.A0D;
        r2.A0E = r4.A0E;
        Intent[] intentArr = r4.A0P;
        r2.A0P = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
        r2.A04 = r4.A04;
        r2.A0B = r4.A0B;
        r2.A0C = r4.A0C;
        r2.A0A = r4.A0A;
        r2.A00 = r4.A00;
        r2.A09 = r4.A09;
        r2.A0H = r4.A0H;
        r2.A07 = r4.A07;
        r2.A03 = r4.A03;
        r2.A0I = r4.A0I;
        r2.A0K = r4.A0K;
        r2.A0O = r4.A0O;
        r2.A0J = r4.A0J;
        r2.A0M = r4.A0M;
        r2.A0L = r4.A0L;
        r2.A08 = r4.A08;
        r2.A0N = r4.A0N;
        r2.A0G = r4.A0G;
        r2.A02 = r4.A02;
        C04440Of[] r1 = r4.A0Q;
        if (r1 != null) {
            r2.A0Q = (C04440Of[]) Arrays.copyOf(r1, r1.length);
        }
        Set set = r4.A0F;
        if (set != null) {
            r2.A0F = new HashSet(set);
        }
        PersistableBundle persistableBundle = r4.A06;
        if (persistableBundle != null) {
            r2.A06 = persistableBundle;
        }
        r2.A01 = r4.A01;
    }

    public C05920Vm(Context context, String str) {
        AnonymousClass0U1 r0 = new AnonymousClass0U1();
        this.A00 = r0;
        r0.A05 = context;
        r0.A0D = str;
    }
}
