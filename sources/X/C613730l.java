package X;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.30l  reason: invalid class name and case insensitive filesystem */
public class C613730l {
    public static final Set A03;
    public SharedPreferences A00;
    public final C56972sr A01;
    public final C60152y5 A02;

    public synchronized long A01(String str) {
        long A0B;
        A0B = AnonymousClass0x2.A0B(A02(), str);
        C18270x1.A0n(A02(), str);
        return A0B;
    }

    public final synchronized SharedPreferences A02() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A03("syncd_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public synchronized void A06(String str, long j) {
        C18270x1.A0i(A00(this), str, AnonymousClass0x2.A0B(A02(), str) + j);
    }

    public void A05(int i) {
        if (this.A01.A0Y()) {
            C626936e.A0D(false, "SyncdSharedPreferences/ should not be setting SyncD dirty state in companion mode");
        } else {
            C18270x1.A0h(A00(this), "syncd_dirty", i);
        }
    }

    static {
        HashSet A0K = AnonymousClass002.A0K();
        A03 = A0K;
        A0K.add("first_transient_server_failure_timestamp");
        Set set = A03;
        set.add("syncd_dirty");
        set.add("syncd_dirty_reason");
        set.add("syncd_last_companion_dereg_time");
        set.add("syncd_last_companion_dereg_logging_time");
        set.add("syncd_first_companion_reg_logging_time");
        set.add("syncd_bootstrap_state");
        set.add("syncd_bootstrapped_mutations");
        set.add("syncd_last_lthash_consistency_check_time");
        set.add("syncd_one_time_cleanup_for_non_md_user");
        set.add("syncd_has_logged_snapshot_mac_mismatch_in_patch");
    }

    public C613730l(C56972sr r1, C60152y5 r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public static SharedPreferences.Editor A00(C613730l r0) {
        return r0.A02().edit();
    }

    public Set A03() {
        Set<String> stringSet;
        synchronized ("syncd_bootstrapped_mutations") {
            stringSet = A02().getStringSet("syncd_bootstrapped_mutations", Collections.emptySet());
            C626936e.A06(stringSet);
        }
        return stringSet;
    }

    public void A04(int i) {
        if (!A08()) {
            A05(0);
            C18270x1.A0g(A00(this), "syncd_last_companion_dereg_time");
            C18270x1.A0h(A00(this), "syncd_dirty_reason", i);
        }
    }

    public void A07(Set set) {
        synchronized ("syncd_bootstrapped_mutations") {
            Set A032 = A03();
            HashSet A0K = AnonymousClass002.A0K();
            A0K.addAll(set);
            A0K.addAll(A032);
            C18300x5.A15(A00(this), "syncd_bootstrapped_mutations", A0K);
        }
    }

    public boolean A08() {
        return AnonymousClass001.A1X(A02().getInt("syncd_dirty", -1), -1);
    }
}
