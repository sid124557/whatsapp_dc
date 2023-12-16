package X;

/* renamed from: X.9l0  reason: invalid class name and case insensitive filesystem */
public final class C201889l0 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ String $annotationKey;
    public final /* synthetic */ boolean $annotationValue;
    public final /* synthetic */ Integer $instanceKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C201889l0(Integer num, String str, boolean z) {
        super(1);
        this.$instanceKey = num;
        this.$annotationKey = str;
        this.$annotationValue = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass316 r6 = (AnonymousClass316) obj;
        C162457s7.A0J(r6, 0);
        Integer num = this.$instanceKey;
        if (num == null) {
            r6.A0D(this.$annotationKey, this.$annotationValue, false);
        } else {
            r6.A0C.markerAnnotate(r6.A0A.A07, num.intValue(), this.$annotationKey, this.$annotationValue);
        }
        return C59022wD.A00;
    }
}
