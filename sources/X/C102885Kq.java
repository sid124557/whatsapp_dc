package X;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.5Kq  reason: invalid class name and case insensitive filesystem */
public class C102885Kq {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final /* synthetic */ AudioPickerActivity A08;

    public C102885Kq(AudioPickerActivity audioPickerActivity, String str, String str2, String str3, int i, int i2, int i3) {
        int i4 = i3;
        this.A08 = audioPickerActivity;
        this.A00 = i;
        this.A02 = (TextUtils.isEmpty(str) || str.equalsIgnoreCase("<unknown>")) ? null : str;
        this.A07 = str2;
        this.A03 = str3;
        this.A01 = i4;
        int i5 = i2;
        this.A05 = DateUtils.formatElapsedTime(C18290x4.A0B((long) i5));
        C620733j r8 = audioPickerActivity.A00;
        long A062 = C56952sp.A06(audioPickerActivity.A0D, 3657) * SearchActionVerificationClientService.MS_TO_NS;
        long j = (long) i4;
        if (j >= A062 - 60000 && j < A062) {
            i4 = (int) (j - 60000);
        }
        this.A06 = (String) AnonymousClass35V.A00(r8, (long) i4, true, false).first;
        this.A04 = C107565bW.A0B(audioPickerActivity.A00, (long) Math.max(0, i5));
    }
}
