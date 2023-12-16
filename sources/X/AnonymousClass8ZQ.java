package X;

/* renamed from: X.8ZQ  reason: invalid class name */
public final class AnonymousClass8ZQ extends C829045j implements AnonymousClass4GR {
    public final /* synthetic */ char[] $delimiters;
    public final /* synthetic */ boolean $ignoreCase = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8ZQ(char[] cArr) {
        super(2);
        this.$delimiters = cArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int A0K = AnonymousClass001.A0K(obj2);
        C162457s7.A0J(charSequence, 0);
        int A0H = C175728Zm.A0H(charSequence, this.$delimiters, A0K, this.$ignoreCase);
        if (A0H < 0) {
            return null;
        }
        return AnonymousClass3Z6.A01(Integer.valueOf(A0H), 1);
    }
}
