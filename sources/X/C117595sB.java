package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.whatsapp.text.ReadMoreTextView;

/* renamed from: X.5sB  reason: invalid class name and case insensitive filesystem */
public class C117595sB implements Runnable {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03;
    public final /* synthetic */ ReadMoreTextView A04;

    public C117595sB(ReadMoreTextView readMoreTextView) {
        this.A04 = readMoreTextView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r5.length() == 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableStringBuilder A00(android.text.SpannableStringBuilder r7, java.lang.CharSequence r8, int r9, int r10) {
        /*
            r6 = this;
            if (r10 == 0) goto L_0x0045
            r2 = 0
            int r1 = r8.length()
            r0 = 0
            if (r1 == 0) goto L_0x000e
            int r0 = X.C86644Kx.A06(r8, r10)
        L_0x000e:
            java.lang.CharSequence r5 = r8.subSequence(r2, r0)
            r4 = 0
            if (r5 == 0) goto L_0x001c
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x0050
            int r2 = r5.length()
            int r1 = r2 + -1
        L_0x0027:
            if (r4 >= r2) goto L_0x0036
            char r0 = r5.charAt(r4)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L_0x0036
            int r4 = r4 + 1
            goto L_0x0027
        L_0x0036:
            if (r1 <= 0) goto L_0x0048
            char r0 = r5.charAt(r1)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L_0x0048
            int r1 = r1 + -1
            goto L_0x0036
        L_0x0045:
            java.lang.String r3 = ""
            goto L_0x0050
        L_0x0048:
            if (r1 <= r4) goto L_0x0050
            int r0 = r1 + 1
            java.lang.CharSequence r3 = r5.subSequence(r4, r0)
        L_0x0050:
            android.text.SpannableStringBuilder r3 = X.C18330xA.A00(r3)
            r3.append(r7)
            com.whatsapp.text.ReadMoreTextView r2 = r6.A04
            int r1 = r6.A00
            X.8sC r0 = com.whatsapp.text.ReadMoreTextView.A0B
            android.text.Layout r0 = r0.B0m(r2, r3, r1)
            int r0 = r0.getLineCount()
            if (r0 <= r9) goto L_0x0068
            r3 = 0
        L_0x0068:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117595sB.A00(android.text.SpannableStringBuilder, java.lang.CharSequence, int, int):android.text.SpannableStringBuilder");
    }

    public void run() {
        ReadMoreTextView readMoreTextView = this.A04;
        if (readMoreTextView.A00 != 0 && !readMoreTextView.A0M()) {
            int A06 = AnonymousClass000.A06(readMoreTextView, readMoreTextView.getWidth());
            int A05 = AnonymousClass000.A05(readMoreTextView, readMoreTextView.getHeight());
            int i = C86634Kw.A0E(readMoreTextView).orientation;
            if ((this.A03 != A06 || this.A01 != A05) && readMoreTextView.getLayout() != null) {
                if (this.A00 == 0 || i != this.A02) {
                    this.A00 = A06;
                }
                this.A03 = A06;
                this.A01 = A05;
                this.A02 = i;
                CharSequence charSequence = readMoreTextView.A03;
                int length = charSequence.length();
                int i2 = (readMoreTextView.A00 + 3) * 150;
                if (length > i2) {
                    CharSequence charSequence2 = readMoreTextView.A03;
                    int i3 = 0;
                    if (charSequence2.length() != 0) {
                        i3 = C86644Kx.A06(charSequence2, i2);
                    }
                    charSequence = charSequence2.subSequence(0, i3);
                }
                Layout B0m = ReadMoreTextView.A0B.B0m(readMoreTextView, charSequence, this.A00);
                boolean A1W = C86624Kv.A1W(B0m.getLineCount(), readMoreTextView.A00);
                readMoreTextView.A05 = A1W;
                if (A1W) {
                    if (readMoreTextView.A04 != null) {
                        SpannableStringBuilder append = C18330xA.A00("... ").append(readMoreTextView.A04);
                        append.setSpan(new C1232667t(readMoreTextView.getContext(), this, readMoreTextView.A01, 4), 4, append.length(), 18);
                        if (readMoreTextView.A06) {
                            append.setSpan(new StyleSpan(1), 4, append.length(), 18);
                        }
                        int lineEnd = B0m.getLineEnd(readMoreTextView.A00 - 1);
                        SpannableStringBuilder A002 = A00(append, charSequence, readMoreTextView.A00, lineEnd);
                        if (A002 == null) {
                            A002 = A00(append, charSequence, readMoreTextView.A00, AnonymousClass001.A0C(lineEnd, append.length(), 0));
                            if (A002 == null) {
                                int i4 = readMoreTextView.A00;
                                A002 = A00(append, charSequence, i4, B0m.getLineStart(i4 - 1));
                            }
                        }
                        if (!TextUtils.equals(readMoreTextView.getText(), A002)) {
                            readMoreTextView.setVisibleText(A002);
                            return;
                        }
                        return;
                    }
                    throw AnonymousClass001.A0g("You must specify an rmtvText attribute");
                } else if (!TextUtils.equals(readMoreTextView.getText(), readMoreTextView.A03)) {
                    readMoreTextView.setVisibleText(readMoreTextView.A03);
                }
            }
        }
    }
}
