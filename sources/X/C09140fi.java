package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0fi  reason: invalid class name and case insensitive filesystem */
public final class C09140fi implements C17060uV {
    public final C012209r A00;
    public final C17630vt A01;
    public final AnonymousClass0R5 A02;
    public final AnonymousClass0QE A03;
    public final AnonymousClass0QE A04;
    public final AnonymousClass0QE A05;
    public final AnonymousClass0QE A06;
    public final AnonymousClass0QE A07;
    public final AnonymousClass0QE A08;
    public final AnonymousClass0QE A09;
    public final AnonymousClass0QE A0A;
    public final AnonymousClass0QE A0B;
    public final AnonymousClass0QE A0C;
    public final AnonymousClass0QE A0D;

    public void B1L(String str) {
        AnonymousClass0R5 r3 = this.A02;
        r3.A09();
        AnonymousClass0QE r2 = this.A03;
        C17320vK A002 = AnonymousClass0QE.A00(r3, r2, str);
        try {
            AnonymousClass0A6.A00(r3, A002);
        } finally {
            r3.A0C();
            r2.A04(A002);
        }
    }

    public List B4O(int i) {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        C08700eu A002 = C02920Ic.A00("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        A002.Axs(1, (long) 200);
        AnonymousClass0R5 r1 = this.A02;
        r1.A09();
        Cursor A003 = C02930Id.A00(r1, A002, false);
        try {
            int A022 = AnonymousClass0X4.A02(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A023 = AnonymousClass0X4.A02(A003, "state");
            int A024 = AnonymousClass0X4.A02(A003, "worker_class_name");
            int A025 = AnonymousClass0X4.A02(A003, "input_merger_class_name");
            int A026 = AnonymousClass0X4.A02(A003, "input");
            int A027 = AnonymousClass0X4.A02(A003, "output");
            int A028 = AnonymousClass0X4.A02(A003, "initial_delay");
            int A029 = AnonymousClass0X4.A02(A003, "interval_duration");
            int A0210 = AnonymousClass0X4.A02(A003, "flex_duration");
            int A0211 = AnonymousClass0X4.A02(A003, "run_attempt_count");
            int A0212 = AnonymousClass0X4.A02(A003, "backoff_policy");
            int A0213 = AnonymousClass0X4.A02(A003, "backoff_delay_duration");
            int A0214 = AnonymousClass0X4.A02(A003, "last_enqueue_time");
            int A0215 = AnonymousClass0X4.A02(A003, "minimum_retention_duration");
            int A0216 = AnonymousClass0X4.A02(A003, "schedule_requested_at");
            int A0217 = AnonymousClass0X4.A02(A003, "run_in_foreground");
            int A0218 = AnonymousClass0X4.A02(A003, "out_of_quota_policy");
            int A0219 = AnonymousClass0X4.A02(A003, "period_count");
            int A0220 = AnonymousClass0X4.A02(A003, "generation");
            int A0221 = AnonymousClass0X4.A02(A003, "required_network_type");
            int A0222 = AnonymousClass0X4.A02(A003, "requires_charging");
            int A0223 = AnonymousClass0X4.A02(A003, "requires_device_idle");
            int A0224 = AnonymousClass0X4.A02(A003, "requires_battery_not_low");
            int A0225 = AnonymousClass0X4.A02(A003, "requires_storage_not_low");
            int A0226 = AnonymousClass0X4.A02(A003, "trigger_content_update_delay");
            int A0227 = AnonymousClass0X4.A02(A003, "trigger_max_content_delay");
            int A0228 = AnonymousClass0X4.A02(A003, "content_uri_triggers");
            ArrayList A0o = AnonymousClass000.A0o(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(A022)) {
                    str = null;
                } else {
                    str = A003.getString(A022);
                }
                AnonymousClass0GD A072 = AnonymousClass0YN.A07(A003.getInt(A023));
                if (A003.isNull(A024)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(A024);
                }
                if (A003.isNull(A025)) {
                    str3 = null;
                } else {
                    str3 = A003.getString(A025);
                }
                if (A003.isNull(A026)) {
                    bArr = null;
                } else {
                    bArr = A003.getBlob(A026);
                }
                AnonymousClass0Xq A004 = AnonymousClass0Xq.A00(bArr);
                if (A003.isNull(A027)) {
                    bArr2 = null;
                } else {
                    bArr2 = A003.getBlob(A027);
                }
                AnonymousClass0Xq A005 = AnonymousClass0Xq.A00(bArr2);
                long j = A003.getLong(A028);
                long j2 = A003.getLong(A029);
                long j3 = A003.getLong(A0210);
                int i2 = A003.getInt(A0211);
                AnonymousClass0FN A042 = AnonymousClass0YN.A04(A003.getInt(A0212));
                long j4 = A003.getLong(A0213);
                long j5 = A003.getLong(A0214);
                long j6 = A003.getLong(A0215);
                long j7 = A003.getLong(A0216);
                boolean A1S = AnonymousClass000.A1S(A003.getInt(A0217));
                AnonymousClass0FO A062 = AnonymousClass0YN.A06(A003.getInt(A0218));
                int i3 = A003.getInt(A0219);
                int i4 = A003.getInt(A0220);
                C02380Fy A052 = AnonymousClass0YN.A05(A003.getInt(A0221));
                boolean A1S2 = AnonymousClass000.A1S(A003.getInt(A0222));
                boolean A1S3 = AnonymousClass000.A1S(A003.getInt(A0223));
                boolean A1S4 = AnonymousClass000.A1S(A003.getInt(A0224));
                boolean A1S5 = AnonymousClass000.A1S(A003.getInt(A0225));
                long j8 = A003.getLong(A0226);
                long j9 = A003.getLong(A0227);
                if (A003.isNull(A0228)) {
                    bArr3 = null;
                } else {
                    bArr3 = A003.getBlob(A0228);
                }
                A0o.add(new C06250Wv(A042, new AnonymousClass0XS(A052, AnonymousClass0YN.A08(bArr3), j8, j9, A1S2, A1S3, A1S4, A1S5), A004, A005, A062, A072, str, str2, str3, i2, i3, i4, j, j2, j3, j4, j5, j6, j7, A1S));
            }
            return A0o;
        } finally {
            A003.close();
            A002.A01();
        }
    }

    public List BCO() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        C08700eu A002 = C02920Ic.A00("SELECT * FROM workspec WHERE state=1", 0);
        AnonymousClass0R5 r1 = this.A02;
        r1.A09();
        Cursor A003 = C02930Id.A00(r1, A002, false);
        try {
            int A022 = AnonymousClass0X4.A02(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A023 = AnonymousClass0X4.A02(A003, "state");
            int A024 = AnonymousClass0X4.A02(A003, "worker_class_name");
            int A025 = AnonymousClass0X4.A02(A003, "input_merger_class_name");
            int A026 = AnonymousClass0X4.A02(A003, "input");
            int A027 = AnonymousClass0X4.A02(A003, "output");
            int A028 = AnonymousClass0X4.A02(A003, "initial_delay");
            int A029 = AnonymousClass0X4.A02(A003, "interval_duration");
            int A0210 = AnonymousClass0X4.A02(A003, "flex_duration");
            int A0211 = AnonymousClass0X4.A02(A003, "run_attempt_count");
            int A0212 = AnonymousClass0X4.A02(A003, "backoff_policy");
            int A0213 = AnonymousClass0X4.A02(A003, "backoff_delay_duration");
            int A0214 = AnonymousClass0X4.A02(A003, "last_enqueue_time");
            int A0215 = AnonymousClass0X4.A02(A003, "minimum_retention_duration");
            int A0216 = AnonymousClass0X4.A02(A003, "schedule_requested_at");
            int A0217 = AnonymousClass0X4.A02(A003, "run_in_foreground");
            int A0218 = AnonymousClass0X4.A02(A003, "out_of_quota_policy");
            int A0219 = AnonymousClass0X4.A02(A003, "period_count");
            int A0220 = AnonymousClass0X4.A02(A003, "generation");
            int A0221 = AnonymousClass0X4.A02(A003, "required_network_type");
            int A0222 = AnonymousClass0X4.A02(A003, "requires_charging");
            int A0223 = AnonymousClass0X4.A02(A003, "requires_device_idle");
            int A0224 = AnonymousClass0X4.A02(A003, "requires_battery_not_low");
            int A0225 = AnonymousClass0X4.A02(A003, "requires_storage_not_low");
            int A0226 = AnonymousClass0X4.A02(A003, "trigger_content_update_delay");
            int A0227 = AnonymousClass0X4.A02(A003, "trigger_max_content_delay");
            int A0228 = AnonymousClass0X4.A02(A003, "content_uri_triggers");
            ArrayList A0o = AnonymousClass000.A0o(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(A022)) {
                    str = null;
                } else {
                    str = A003.getString(A022);
                }
                AnonymousClass0GD A072 = AnonymousClass0YN.A07(A003.getInt(A023));
                if (A003.isNull(A024)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(A024);
                }
                if (A003.isNull(A025)) {
                    str3 = null;
                } else {
                    str3 = A003.getString(A025);
                }
                if (A003.isNull(A026)) {
                    bArr = null;
                } else {
                    bArr = A003.getBlob(A026);
                }
                AnonymousClass0Xq A004 = AnonymousClass0Xq.A00(bArr);
                if (A003.isNull(A027)) {
                    bArr2 = null;
                } else {
                    bArr2 = A003.getBlob(A027);
                }
                AnonymousClass0Xq A005 = AnonymousClass0Xq.A00(bArr2);
                long j = A003.getLong(A028);
                long j2 = A003.getLong(A029);
                long j3 = A003.getLong(A0210);
                int i = A003.getInt(A0211);
                AnonymousClass0FN A042 = AnonymousClass0YN.A04(A003.getInt(A0212));
                long j4 = A003.getLong(A0213);
                long j5 = A003.getLong(A0214);
                long j6 = A003.getLong(A0215);
                long j7 = A003.getLong(A0216);
                boolean A1S = AnonymousClass000.A1S(A003.getInt(A0217));
                AnonymousClass0FO A062 = AnonymousClass0YN.A06(A003.getInt(A0218));
                int i2 = A003.getInt(A0219);
                int i3 = A003.getInt(A0220);
                C02380Fy A052 = AnonymousClass0YN.A05(A003.getInt(A0221));
                boolean A1S2 = AnonymousClass000.A1S(A003.getInt(A0222));
                boolean A1S3 = AnonymousClass000.A1S(A003.getInt(A0223));
                boolean A1S4 = AnonymousClass000.A1S(A003.getInt(A0224));
                boolean A1S5 = AnonymousClass000.A1S(A003.getInt(A0225));
                long j8 = A003.getLong(A0226);
                long j9 = A003.getLong(A0227);
                if (A003.isNull(A0228)) {
                    bArr3 = null;
                } else {
                    bArr3 = A003.getBlob(A0228);
                }
                A0o.add(new C06250Wv(A042, new AnonymousClass0XS(A052, AnonymousClass0YN.A08(bArr3), j8, j9, A1S2, A1S3, A1S4, A1S5), A004, A005, A062, A072, str, str2, str3, i, i2, i3, j, j2, j3, j4, j5, j6, j7, A1S));
            }
            return A0o;
        } finally {
            A003.close();
            A002.A01();
        }
    }

    public List BCT() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        C08700eu A002 = C02920Ic.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        AnonymousClass0R5 r1 = this.A02;
        r1.A09();
        Cursor A003 = C02930Id.A00(r1, A002, false);
        try {
            int A022 = AnonymousClass0X4.A02(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A023 = AnonymousClass0X4.A02(A003, "state");
            int A024 = AnonymousClass0X4.A02(A003, "worker_class_name");
            int A025 = AnonymousClass0X4.A02(A003, "input_merger_class_name");
            int A026 = AnonymousClass0X4.A02(A003, "input");
            int A027 = AnonymousClass0X4.A02(A003, "output");
            int A028 = AnonymousClass0X4.A02(A003, "initial_delay");
            int A029 = AnonymousClass0X4.A02(A003, "interval_duration");
            int A0210 = AnonymousClass0X4.A02(A003, "flex_duration");
            int A0211 = AnonymousClass0X4.A02(A003, "run_attempt_count");
            int A0212 = AnonymousClass0X4.A02(A003, "backoff_policy");
            int A0213 = AnonymousClass0X4.A02(A003, "backoff_delay_duration");
            int A0214 = AnonymousClass0X4.A02(A003, "last_enqueue_time");
            int A0215 = AnonymousClass0X4.A02(A003, "minimum_retention_duration");
            int A0216 = AnonymousClass0X4.A02(A003, "schedule_requested_at");
            int A0217 = AnonymousClass0X4.A02(A003, "run_in_foreground");
            int A0218 = AnonymousClass0X4.A02(A003, "out_of_quota_policy");
            int A0219 = AnonymousClass0X4.A02(A003, "period_count");
            int A0220 = AnonymousClass0X4.A02(A003, "generation");
            int A0221 = AnonymousClass0X4.A02(A003, "required_network_type");
            int A0222 = AnonymousClass0X4.A02(A003, "requires_charging");
            int A0223 = AnonymousClass0X4.A02(A003, "requires_device_idle");
            int A0224 = AnonymousClass0X4.A02(A003, "requires_battery_not_low");
            int A0225 = AnonymousClass0X4.A02(A003, "requires_storage_not_low");
            int A0226 = AnonymousClass0X4.A02(A003, "trigger_content_update_delay");
            int A0227 = AnonymousClass0X4.A02(A003, "trigger_max_content_delay");
            int A0228 = AnonymousClass0X4.A02(A003, "content_uri_triggers");
            ArrayList A0o = AnonymousClass000.A0o(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(A022)) {
                    str = null;
                } else {
                    str = A003.getString(A022);
                }
                AnonymousClass0GD A072 = AnonymousClass0YN.A07(A003.getInt(A023));
                if (A003.isNull(A024)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(A024);
                }
                if (A003.isNull(A025)) {
                    str3 = null;
                } else {
                    str3 = A003.getString(A025);
                }
                if (A003.isNull(A026)) {
                    bArr = null;
                } else {
                    bArr = A003.getBlob(A026);
                }
                AnonymousClass0Xq A004 = AnonymousClass0Xq.A00(bArr);
                if (A003.isNull(A027)) {
                    bArr2 = null;
                } else {
                    bArr2 = A003.getBlob(A027);
                }
                AnonymousClass0Xq A005 = AnonymousClass0Xq.A00(bArr2);
                long j = A003.getLong(A028);
                long j2 = A003.getLong(A029);
                long j3 = A003.getLong(A0210);
                int i = A003.getInt(A0211);
                AnonymousClass0FN A042 = AnonymousClass0YN.A04(A003.getInt(A0212));
                long j4 = A003.getLong(A0213);
                long j5 = A003.getLong(A0214);
                long j6 = A003.getLong(A0215);
                long j7 = A003.getLong(A0216);
                boolean A1S = AnonymousClass000.A1S(A003.getInt(A0217));
                AnonymousClass0FO A062 = AnonymousClass0YN.A06(A003.getInt(A0218));
                int i2 = A003.getInt(A0219);
                int i3 = A003.getInt(A0220);
                C02380Fy A052 = AnonymousClass0YN.A05(A003.getInt(A0221));
                boolean A1S2 = AnonymousClass000.A1S(A003.getInt(A0222));
                boolean A1S3 = AnonymousClass000.A1S(A003.getInt(A0223));
                boolean A1S4 = AnonymousClass000.A1S(A003.getInt(A0224));
                boolean A1S5 = AnonymousClass000.A1S(A003.getInt(A0225));
                long j8 = A003.getLong(A0226);
                long j9 = A003.getLong(A0227);
                if (A003.isNull(A0228)) {
                    bArr3 = null;
                } else {
                    bArr3 = A003.getBlob(A0228);
                }
                A0o.add(new C06250Wv(A042, new AnonymousClass0XS(A052, AnonymousClass0YN.A08(bArr3), j8, j9, A1S2, A1S3, A1S4, A1S5), A004, A005, A062, A072, str, str2, str3, i, i2, i3, j, j2, j3, j4, j5, j6, j7, A1S));
            }
            return A0o;
        } finally {
            A003.close();
            A002.A01();
        }
    }

    public AnonymousClass0GD BDH(String str) {
        C08700eu A012 = C02920Ic.A01("SELECT state FROM workspec WHERE id=?", str);
        AnonymousClass0R5 r0 = this.A02;
        r0.A09();
        AnonymousClass0GD r3 = null;
        Cursor A002 = C02930Id.A00(r0, A012, false);
        try {
            if (A002.moveToFirst() && !A002.isNull(0)) {
                int i = A002.getInt(0);
                if (Integer.valueOf(i) != null) {
                    r3 = AnonymousClass0YN.A07(i);
                }
            }
            return r3;
        } finally {
            A002.close();
            A012.A01();
        }
    }

    public C06250Wv BEX(String str) {
        C06250Wv r30;
        String str2;
        String str3;
        String str4;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        C08700eu A012 = C02920Ic.A01("SELECT * FROM workspec WHERE id=?", str);
        AnonymousClass0R5 r2 = this.A02;
        r2.A09();
        Cursor A002 = C02930Id.A00(r2, A012, false);
        try {
            int A022 = AnonymousClass0X4.A02(A002, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A023 = AnonymousClass0X4.A02(A002, "state");
            int A024 = AnonymousClass0X4.A02(A002, "worker_class_name");
            int A025 = AnonymousClass0X4.A02(A002, "input_merger_class_name");
            int A026 = AnonymousClass0X4.A02(A002, "input");
            int A027 = AnonymousClass0X4.A02(A002, "output");
            int A028 = AnonymousClass0X4.A02(A002, "initial_delay");
            int A029 = AnonymousClass0X4.A02(A002, "interval_duration");
            int A0210 = AnonymousClass0X4.A02(A002, "flex_duration");
            int A0211 = AnonymousClass0X4.A02(A002, "run_attempt_count");
            int A0212 = AnonymousClass0X4.A02(A002, "backoff_policy");
            int A0213 = AnonymousClass0X4.A02(A002, "backoff_delay_duration");
            int A0214 = AnonymousClass0X4.A02(A002, "last_enqueue_time");
            int A0215 = AnonymousClass0X4.A02(A002, "minimum_retention_duration");
            int A0216 = AnonymousClass0X4.A02(A002, "schedule_requested_at");
            int A0217 = AnonymousClass0X4.A02(A002, "run_in_foreground");
            int A0218 = AnonymousClass0X4.A02(A002, "out_of_quota_policy");
            int A0219 = AnonymousClass0X4.A02(A002, "period_count");
            int A0220 = AnonymousClass0X4.A02(A002, "generation");
            int A0221 = AnonymousClass0X4.A02(A002, "required_network_type");
            int A0222 = AnonymousClass0X4.A02(A002, "requires_charging");
            int A0223 = AnonymousClass0X4.A02(A002, "requires_device_idle");
            int A0224 = AnonymousClass0X4.A02(A002, "requires_battery_not_low");
            int A0225 = AnonymousClass0X4.A02(A002, "requires_storage_not_low");
            int A0226 = AnonymousClass0X4.A02(A002, "trigger_content_update_delay");
            int A0227 = AnonymousClass0X4.A02(A002, "trigger_max_content_delay");
            int A0228 = AnonymousClass0X4.A02(A002, "content_uri_triggers");
            if (A002.moveToFirst()) {
                if (A002.isNull(A022)) {
                    str2 = null;
                } else {
                    str2 = A002.getString(A022);
                }
                AnonymousClass0GD A072 = AnonymousClass0YN.A07(A002.getInt(A023));
                if (A002.isNull(A024)) {
                    str3 = null;
                } else {
                    str3 = A002.getString(A024);
                }
                if (A002.isNull(A025)) {
                    str4 = null;
                } else {
                    str4 = A002.getString(A025);
                }
                if (A002.isNull(A026)) {
                    bArr = null;
                } else {
                    bArr = A002.getBlob(A026);
                }
                AnonymousClass0Xq A003 = AnonymousClass0Xq.A00(bArr);
                if (A002.isNull(A027)) {
                    bArr2 = null;
                } else {
                    bArr2 = A002.getBlob(A027);
                }
                AnonymousClass0Xq A004 = AnonymousClass0Xq.A00(bArr2);
                long j = A002.getLong(A028);
                long j2 = A002.getLong(A029);
                long j3 = A002.getLong(A0210);
                int i = A002.getInt(A0211);
                AnonymousClass0FN A042 = AnonymousClass0YN.A04(A002.getInt(A0212));
                long j4 = A002.getLong(A0213);
                long j5 = A002.getLong(A0214);
                long j6 = A002.getLong(A0215);
                long j7 = A002.getLong(A0216);
                boolean A1S = AnonymousClass000.A1S(A002.getInt(A0217));
                AnonymousClass0FO A062 = AnonymousClass0YN.A06(A002.getInt(A0218));
                int i2 = A002.getInt(A0219);
                int i3 = A002.getInt(A0220);
                C02380Fy A052 = AnonymousClass0YN.A05(A002.getInt(A0221));
                boolean A1S2 = AnonymousClass000.A1S(A002.getInt(A0222));
                boolean A1S3 = AnonymousClass000.A1S(A002.getInt(A0223));
                boolean A1S4 = AnonymousClass000.A1S(A002.getInt(A0224));
                boolean A1S5 = AnonymousClass000.A1S(A002.getInt(A0225));
                long j8 = A002.getLong(A0226);
                long j9 = A002.getLong(A0227);
                if (A002.isNull(A0228)) {
                    bArr3 = null;
                } else {
                    bArr3 = A002.getBlob(A0228);
                }
                r30 = new C06250Wv(A042, new AnonymousClass0XS(A052, AnonymousClass0YN.A08(bArr3), j8, j9, A1S2, A1S3, A1S4, A1S5), A003, A004, A062, A072, str2, str3, str4, i, i2, i3, j, j2, j3, j4, j5, j6, j7, A1S);
            } else {
                r30 = null;
            }
            return r30;
        } finally {
            A002.close();
            A012.A01();
        }
    }

    public List BEY(String str) {
        String str2;
        C08700eu A012 = C02920Ic.A01("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", str);
        AnonymousClass0R5 r0 = this.A02;
        r0.A09();
        Cursor A002 = C02930Id.A00(r0, A012, false);
        try {
            ArrayList A0o = AnonymousClass000.A0o(A002);
            while (A002.moveToNext()) {
                if (A002.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = A002.getString(0);
                }
                A0o.add(new AnonymousClass0PM(AnonymousClass0YN.A07(A002.getInt(1)), str2));
            }
            return A0o;
        } finally {
            A002.close();
            A012.A01();
        }
    }

    public int BKZ(String str, long j) {
        AnonymousClass0R5 r3 = this.A02;
        r3.A09();
        AnonymousClass0QE r2 = this.A07;
        C17320vK A012 = r2.A01();
        A012.Axs(1, j);
        if (str == null) {
            A012.Axt(2);
        } else {
            A012.Axu(2, str);
        }
        r3.A0A();
        try {
            int executeUpdateDelete = ((AnonymousClass0A6) A012).A00.executeUpdateDelete();
            r3.A0B();
            return executeUpdateDelete;
        } finally {
            r3.A0C();
            r2.A04(A012);
        }
    }

    public void BmU(String str, long j) {
        AnonymousClass0R5 r3 = this.A02;
        r3.A09();
        AnonymousClass0QE r2 = this.A0B;
        C17320vK A012 = r2.A01();
        A012.Axs(1, j);
        if (str == null) {
            A012.Axt(2);
        } else {
            A012.Axu(2, str);
        }
        r3.A0A();
        try {
            AnonymousClass0A6.A00(r3, A012);
        } finally {
            r3.A0C();
            r2.A04(A012);
        }
    }

    public void Bmn(AnonymousClass0Xq r6, String str) {
        AnonymousClass0R5 r4 = this.A02;
        r4.A09();
        AnonymousClass0QE r3 = this.A0C;
        C17320vK A012 = r3.A01();
        byte[] A013 = AnonymousClass0Xq.A01(r6);
        if (A013 == null) {
            A012.Axt(1);
        } else {
            A012.Axp(1, A013);
        }
        A012.Axu(2, str);
        r4.A0A();
        try {
            AnonymousClass0A6.A00(r4, A012);
        } finally {
            r4.A0C();
            r3.A04(A012);
        }
    }

    public int BnQ(AnonymousClass0GD r7, String str) {
        AnonymousClass0R5 r5 = this.A02;
        r5.A09();
        AnonymousClass0QE r4 = this.A0D;
        C17320vK A012 = r4.A01();
        A012.Axs(1, (long) AnonymousClass0YN.A03(r7));
        if (str == null) {
            A012.Axt(2);
        } else {
            A012.Axu(2, str);
        }
        r5.A0A();
        try {
            int executeUpdateDelete = ((AnonymousClass0A6) A012).A00.executeUpdateDelete();
            r5.A0B();
            return executeUpdateDelete;
        } finally {
            r5.A0C();
            r4.A04(A012);
        }
    }

    public C09140fi(AnonymousClass0R5 r4) {
        this.A02 = r4;
        this.A00 = new C17620vs(r4, this, 5);
        this.A01 = new C17630vt(r4, this, 8);
        this.A03 = new C17630vt(r4, this, 9);
        this.A0D = new C17630vt(r4, this, 10);
        this.A05 = new C17630vt(r4, this, 11);
        this.A0C = new C17630vt(r4, this, 12);
        this.A0B = new C17630vt(r4, this, 13);
        this.A06 = new C17630vt(r4, this, 14);
        this.A0A = new C17630vt(r4, this, 15);
        this.A07 = new C17630vt(r4, this, 4);
        this.A09 = new C17630vt(r4, this, 5);
        this.A08 = new C17630vt(r4, this, 6);
        this.A04 = new C17630vt(r4, this, 7);
    }

    public final void A00(AnonymousClass05C r9) {
        byte[] bArr;
        int i;
        Set keySet = r9.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (r9.size() > 999) {
            AnonymousClass05C r6 = new AnonymousClass05C(999);
            int size = r9.size();
            int i2 = 0;
            loop0:
            while (true) {
                i = 0;
                while (i2 < size) {
                    Object[] objArr = r9.A02;
                    int i3 = i2 << 1;
                    r6.put(objArr[i3], objArr[i3 + 1]);
                    i2++;
                    i++;
                    if (i == 999) {
                        A00(r6);
                        r6 = new AnonymousClass05C(999);
                    }
                }
                break loop0;
            }
            if (i > 0) {
                A00(r6);
                return;
            }
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        for (int i4 = 0; i4 < size2; i4++) {
            A0o.append("?");
            if (i4 < size2 - 1) {
                A0o.append(",");
            }
        }
        C08700eu A002 = C02920Ic.A00(AnonymousClass000.A0e(A0o), size2);
        Iterator it = keySet.iterator();
        int i5 = 1;
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (A0m == null) {
                A002.Axt(i5);
            } else {
                A002.Axu(i5, A0m);
            }
            i5++;
        }
        Cursor A003 = C02930Id.A00(this.A02, A002, false);
        try {
            int A012 = AnonymousClass0X4.A01(A003, "work_spec_id");
            if (A012 != -1) {
                while (A003.moveToNext()) {
                    ArrayList arrayList = (ArrayList) r9.get(A003.getString(A012));
                    if (arrayList != null) {
                        if (A003.isNull(0)) {
                            bArr = null;
                        } else {
                            bArr = A003.getBlob(0);
                        }
                        arrayList.add(AnonymousClass0Xq.A00(bArr));
                    }
                }
            }
        } finally {
            A003.close();
        }
    }

    public final void A01(AnonymousClass05C r9) {
        String str;
        int i;
        Set keySet = r9.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (r9.size() > 999) {
            AnonymousClass05C r6 = new AnonymousClass05C(999);
            int size = r9.size();
            int i2 = 0;
            loop0:
            while (true) {
                i = 0;
                while (i2 < size) {
                    Object[] objArr = r9.A02;
                    int i3 = i2 << 1;
                    r6.put(objArr[i3], objArr[i3 + 1]);
                    i2++;
                    i++;
                    if (i == 999) {
                        A01(r6);
                        r6 = new AnonymousClass05C(999);
                    }
                }
                break loop0;
            }
            if (i > 0) {
                A01(r6);
                return;
            }
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        for (int i4 = 0; i4 < size2; i4++) {
            A0o.append("?");
            if (i4 < size2 - 1) {
                A0o.append(",");
            }
        }
        C08700eu A002 = C02920Ic.A00(AnonymousClass000.A0e(A0o), size2);
        Iterator it = keySet.iterator();
        int i5 = 1;
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (A0m == null) {
                A002.Axt(i5);
            } else {
                A002.Axu(i5, A0m);
            }
            i5++;
        }
        Cursor A003 = C02930Id.A00(this.A02, A002, false);
        try {
            int A012 = AnonymousClass0X4.A01(A003, "work_spec_id");
            if (A012 != -1) {
                while (A003.moveToNext()) {
                    ArrayList arrayList = (ArrayList) r9.get(A003.getString(A012));
                    if (arrayList != null) {
                        if (A003.isNull(0)) {
                            str = null;
                        } else {
                            str = A003.getString(0);
                        }
                        arrayList.add(str);
                    }
                }
            }
        } finally {
            A003.close();
        }
    }
}
