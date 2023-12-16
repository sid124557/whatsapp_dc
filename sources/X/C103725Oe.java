package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.5Oe  reason: invalid class name and case insensitive filesystem */
public class C103725Oe {
    public final C56982ss A00;
    public final C613830m A01;
    public final AnonymousClass319 A02;
    public final C72303dV A03;
    public final C104675Rx A04;
    public final C55832qz A05;
    public final C33141sV A06;

    public C103725Oe(C56982ss r1, C613830m r2, AnonymousClass319 r3, C72303dV r4, C104675Rx r5, C55832qz r6, C33141sV r7) {
        this.A00 = r1;
        this.A05 = r6;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
    }

    public C102355In A00(AnonymousClass0QU r16, int i, int i2) {
        Cursor A022;
        r16.A02();
        try {
            AnonymousClass4GK A032 = this.A03.get();
            try {
                int i3 = i2;
                A022 = AnonymousClass35X.A02(this.A02, (C95814uZ) null, i3, 2);
                r16.A02();
                C86684Lb r5 = new C86684Lb(A022, (AnonymousClass1VX) null, (C95814uZ) null, this.A05);
                ArrayList A0s = AnonymousClass001.A0s();
                ArrayList A0s2 = AnonymousClass001.A0s();
                int columnIndexOrThrow = A022.getColumnIndexOrThrow("file_size");
                long j = 0;
                if (r5.moveToFirst()) {
                    int i4 = 0;
                    do {
                        r16.A02();
                        C30471mV A002 = r5.A00();
                        if (A002 == null || !this.A00.A0P(A002.A1J.A00)) {
                            j += A022.getLong(columnIndexOrThrow);
                            if (i4 < i) {
                                C30471mV A003 = r5.A00();
                                C626936e.A06(A003);
                                AnonymousClass8GZ A004 = AnonymousClass5VD.A00(A003, this.A06);
                                A0s.add(A004);
                                A0s2.add(Long.valueOf(A004.A03.A1L));
                            }
                            i4++;
                        }
                    } while (r5.moveToNext());
                }
                int size = A0s.size();
                r5.close();
                if (i3 == 2) {
                    C104675Rx r52 = this.A04;
                    C34441vA r9 = r52.A01;
                    r9.A05("STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE", String.valueOf(j));
                    r9.A05("STORAGE_USAGE_LARGE_FILES_COUNT", String.valueOf(size));
                    r9.A05("STORAGE_USAGE_LARGE_FILES_ROW_IDS", TextUtils.join(",", A0s2));
                    r52.A01("STORAGE_USAGE_LARGE_FILES_CACHE_TIME");
                } else {
                    C104675Rx r53 = this.A04;
                    C34441vA r92 = r53.A01;
                    r92.A05("STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE", String.valueOf(j));
                    r92.A05("STORAGE_USAGE_FORWARDED_FILES_COUNT", String.valueOf(size));
                    r92.A05("STORAGE_USAGE_FORWARDED_FILES_ROW_IDS", TextUtils.join(",", A0s2));
                    r53.A01("STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME");
                }
                C102355In r0 = new C102355In(A0s, size, j);
                A022.close();
                A032.close();
                return r0;
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
            throw th;
        } catch (C13860nr e) {
            throw e;
        } catch (RuntimeException e2) {
            Log.e("StorageUsageDbFetcher/fetchMediaFilesSummary", e2);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }
}
