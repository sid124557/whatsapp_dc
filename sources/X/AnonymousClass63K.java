package X;

/* renamed from: X.63K  reason: invalid class name */
public final class AnonymousClass63K extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ String $annotationKey;
    public final /* synthetic */ long $annotationValue;
    public final /* synthetic */ Integer $instanceKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63K(Integer num, String str, long j) {
        super(1);
        this.$instanceKey = num;
        this.$annotationKey = str;
        this.$annotationValue = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass316 r8 = (AnonymousClass316) obj;
        C162457s7.A0J(r8, 0);
        Integer num = this.$instanceKey;
        if (num == null) {
            r8.A0C.markerAnnotate(r8.A0A.A07, this.$annotationKey, this.$annotationValue);
        } else {
            r8.A0C.markerAnnotate(r8.A0A.A07, num.intValue(), this.$annotationKey, this.$annotationValue);
        }
        return C59022wD.A00;
    }
}
