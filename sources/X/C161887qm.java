package X;

import android.os.Bundle;
import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.7qm  reason: invalid class name and case insensitive filesystem */
public class C161887qm {
    public static final C142916y0 A0G = C142916y0.STATIC;
    public static final C142886xx A0H = C142886xx.AUTO;
    public static final C142896xy A0I = C142896xy.AUTO;
    public static final C142906xz A0J = C142906xz.FULL_SHEET;
    public C165857xk A00;
    public final int A01;
    public final AnonymousClass0GI A02;
    public final C153427bI A03;
    public final C142916y0 A04;
    public final C166287yR A05;
    public final C142886xx A06;
    public final C142896xy A07;
    public final C142906xz A08;
    public final C166217yK A09;
    public final C166217yK A0A;
    public final Integer A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        X.C159737mN.A00((X.C153427bI) null, "BloksDataStorage", "Casting error when retrieving data", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A02(android.os.Bundle r4, java.lang.Class r5, java.lang.String r6) {
        /*
            r0 = -1
            int r4 = r4.getInt(r6, r0)
            if (r4 != r0) goto L_0x0009
            r3 = 0
        L_0x0008:
            return r3
        L_0x0009:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3 = 0
            if (r0 == 0) goto L_0x0008
            java.lang.Object r2 = X.AnonymousClass0K2.A01     // Catch:{ ClassCastException -> 0x002d }
            monitor-enter(r2)     // Catch:{ ClassCastException -> 0x002d }
            android.util.SparseArray r1 = X.AnonymousClass0K2.A00     // Catch:{ all -> 0x002a }
            int r0 = r1.indexOfKey(r4)     // Catch:{ all -> 0x002a }
            if (r0 >= 0) goto L_0x001d
            monitor-exit(r2)     // Catch:{ ClassCastException -> 0x002d }
            return r3
        L_0x001d:
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x002a }
            java.lang.Object r0 = r5.cast(r0)     // Catch:{ all -> 0x002a }
            r1.delete(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r2)     // Catch:{ ClassCastException -> 0x002d }
            return r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ ClassCastException -> 0x002d }
            throw r0     // Catch:{ ClassCastException -> 0x002d }
        L_0x002d:
            r2 = move-exception
            java.lang.String r1 = "BloksDataStorage"
            java.lang.String r0 = "Casting error when retrieving data"
            X.C159737mN.A00(r3, r1, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161887qm.A02(android.os.Bundle, java.lang.Class, java.lang.String):java.lang.Object");
    }

    public static C161887qm A00() {
        return new C161887qm((AnonymousClass0GI) null, (C153427bI) null, (C165857xk) null, A0G, (C166287yR) null, A0H, A0I, A0J, (C166217yK) null, (C166217yK) null, (Integer) null, (String) null, 16542, false, false, false);
    }

    public static C161887qm A01(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.setClassLoader(C161887qm.class.getClassLoader());
        int i = bundle2.getInt("container_id");
        C142896xy A002 = C142896xy.A00(bundle2.getString("drag_to_dismiss", "auto"));
        C142906xz A003 = C142906xz.A00(bundle2.getString("mode", "full_sheet"));
        C142916y0 A004 = C142916y0.A00(bundle2.getString("background_mode", "static"));
        C142886xx A005 = C142886xx.A00(bundle2.getString("dimmed_background_tap_to_dismiss", "auto"));
        Integer valueOf = Integer.valueOf(bundle2.getInt("keyboard_soft_input_mode"));
        AnonymousClass0GI A006 = AnonymousClass0GI.A00(bundle2.getString("animation_type", CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID));
        A02(bundle2, C179018iT.class, "custom_loading_view_resolver");
        boolean z = bundle2.getBoolean("custom_loading_view_resolver", false);
        boolean z2 = bundle2.getBoolean("native_disable_cancel_button_on_loading_screen", false);
        boolean z3 = bundle2.getBoolean("clear_top_activity", false);
        return new C161887qm(A006, (C153427bI) A02(bundle2, C153427bI.class, "dark_mode_provider"), (C165857xk) A02(bundle2, C165857xk.class, "on_dismiss_callback"), A004, (C166287yR) bundle2.getParcelable("bottom_sheet_margins"), A005, A002, A003, (C166217yK) bundle2.getParcelable("dimmed_background_color"), (C166217yK) bundle2.getParcelable("background_overlay_color"), valueOf, bundle2.getString("bloks_screen_id", (String) null), i, z3, z, z2);
    }

    public static void A03(Bundle bundle, Object obj, String str) {
        if (obj != null) {
            int incrementAndGet = AnonymousClass0K2.A02.incrementAndGet();
            synchronized (AnonymousClass0K2.A01) {
                AnonymousClass0K2.A00.append(incrementAndGet, obj);
            }
            bundle.putInt(str, incrementAndGet);
        }
    }

    public boolean A05() {
        Object obj;
        Object obj2 = this.A07;
        if (obj2 == C142896xy.AUTO) {
            obj2 = this.A08;
            if (obj2 == C142906xz.FULL_SHEET) {
                return true;
            }
            obj = C142906xz.FULL_SCREEN;
        } else {
            obj = C142896xy.DISABLED;
        }
        if (obj2 != obj) {
            return false;
        }
        return true;
    }

    public C161887qm(AnonymousClass0GI r2, C153427bI r3, C165857xk r4, C142916y0 r5, C166287yR r6, C142886xx r7, C142896xy r8, C142906xz r9, C166217yK r10, C166217yK r11, Integer num, String str, int i, boolean z, boolean z2, boolean z3) {
        this.A01 = i;
        this.A03 = r3;
        this.A07 = r8;
        this.A08 = r9;
        this.A04 = r5;
        this.A06 = r7;
        this.A0B = num;
        this.A02 = r2;
        this.A00 = r4;
        this.A0E = z2;
        this.A0D = z3;
        this.A0F = z;
        this.A0A = r10;
        this.A09 = r11;
        this.A05 = r6;
        this.A0C = str;
    }

    public Bundle A04() {
        Bundle A082 = AnonymousClass002.A08();
        A082.putInt("container_id", this.A01);
        A082.putString("drag_to_dismiss", this.A07.value);
        A082.putString("mode", this.A08.value);
        A082.putString("background_mode", this.A04.value);
        A082.putString("dimmed_background_tap_to_dismiss", this.A06.value);
        Integer num = this.A0B;
        if (num != null) {
            A082.putInt("keyboard_soft_input_mode", num.intValue());
        }
        AnonymousClass0GI r0 = this.A02;
        if (r0 != null) {
            A082.putString("animation_type", r0.toString());
        }
        A03(A082, this.A00, "on_dismiss_callback");
        A082.putBoolean("native_use_slide_animation_for_full_screen", this.A0E);
        A082.putBoolean("native_disable_cancel_button_on_loading_screen", this.A0D);
        A082.putBoolean("clear_top_activity", this.A0F);
        A082.putParcelable("dimmed_background_color", this.A0A);
        A082.putParcelable("background_overlay_color", this.A09);
        A082.putParcelable("bottom_sheet_margins", this.A05);
        A082.setClassLoader(C161887qm.class.getClassLoader());
        String str = this.A0C;
        if (str != null) {
            A082.putString("bloks_screen_id", str);
        }
        A03(A082, this.A03, "dark_mode_provider");
        return A082;
    }
}
