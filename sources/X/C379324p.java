package X;

/* renamed from: X.24p  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C379324p {
    public static /* synthetic */ String A00(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            int length = charSequenceArr.length;
            if (length > 0) {
                A0o.append(charSequenceArr[0]);
                for (int i = 1; i < length; i++) {
                    A0o.append(charSequence);
                    A0o.append(charSequenceArr[i]);
                }
            }
            return A0o.toString();
        }
        throw AnonymousClass001.A0g("delimiter");
    }
}
