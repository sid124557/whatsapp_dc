package X;

/* renamed from: X.8WM  reason: invalid class name */
public final class AnonymousClass8WM extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass1VX $abProps;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8WM(AnonymousClass1VX r2) {
        super(0);
        this.$abProps = r2;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0095 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00b5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0085 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0091 A[Catch:{ JSONException -> 0x0095 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1 A[Catch:{ JSONException -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1 A[Catch:{ JSONException -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2 A[Catch:{ JSONException -> 0x00c6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r6 = this;
            X.7QW r2 = new X.7QW
            r2.<init>()
            r0 = 1
            r2.A0e = r0
            java.lang.String r0 = "whatsapp"
            r2.A0U = r0
            r4 = 1
            r2.A0h = r4
            r0 = 60000(0xea60, double:2.9644E-319)
            r2.A0F = r0
            r2.A0f = r4
            r2.A0D = r4
            r0 = 12000(0x2ee0, float:1.6816E-41)
            r2.A03 = r0
            r0 = 60000(0xea60, float:8.4078E-41)
            r2.A04 = r0
            java.lang.String r0 = "WA_Player_SubOrigin"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.HashSet r0 = X.C73833g9.A03(r0)
            r2.A0X = r0
            r2.A0j = r4
            X.7RF r0 = new X.7RF
            r0.<init>()
            r0.A00 = r4
            X.8Kz r0 = new X.8Kz
            r0.<init>(r4)
            r2.A0M = r0
            X.1VX r1 = r6.$abProps
            r0 = 5590(0x15d6, float:7.833E-42)
            int r0 = r1.A0N(r0)
            r2.A0C = r0
            X.1VX r1 = r6.$abProps
            r0 = 5812(0x16b4, float:8.144E-42)
            int r0 = r1.A0N(r0)
            r2.A0B = r0
            X.1VX r1 = r6.$abProps
            r0 = 5439(0x153f, float:7.622E-42)
            boolean r0 = r1.A0X(r0)
            r2.A0n = r0
            X.1VX r1 = r6.$abProps
            r0 = 5897(0x1709, float:8.263E-42)
            int r0 = r1.A0N(r0)
            r2.A08 = r0
            X.1VX r1 = r6.$abProps
            r0 = 5898(0x170a, float:8.265E-42)
            java.lang.String r1 = r1.A0Q(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00c8 }
            if (r0 != 0) goto L_0x00c8
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x00c8 }
            java.lang.String r3 = "minBufferMs"
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r0 = r5.has(r3)     // Catch:{ JSONException -> 0x0085 }
            if (r0 == 0) goto L_0x0085
            int r1 = r5.getInt(r3)     // Catch:{ JSONException -> 0x0085 }
        L_0x0085:
            r2.A06 = r1     // Catch:{ JSONException -> 0x00c8 }
            java.lang.String r3 = "maxBufferMs"
            r1 = 2000(0x7d0, float:2.803E-42)
            boolean r0 = r5.has(r3)     // Catch:{ JSONException -> 0x0095 }
            if (r0 == 0) goto L_0x0095
            int r1 = r5.getInt(r3)     // Catch:{ JSONException -> 0x0095 }
        L_0x0095:
            r2.A05 = r1     // Catch:{ JSONException -> 0x00c8 }
            java.lang.String r3 = "bufferForPlaybackMs"
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r0 = r5.has(r3)     // Catch:{ JSONException -> 0x00a5 }
            if (r0 == 0) goto L_0x00a5
            int r1 = r5.getInt(r3)     // Catch:{ JSONException -> 0x00a5 }
        L_0x00a5:
            r2.A00 = r1     // Catch:{ JSONException -> 0x00c8 }
            java.lang.String r3 = "rebufferMs"
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r0 = r5.has(r3)     // Catch:{ JSONException -> 0x00b5 }
            if (r0 == 0) goto L_0x00b5
            int r1 = r5.getInt(r3)     // Catch:{ JSONException -> 0x00b5 }
        L_0x00b5:
            r2.A02 = r1     // Catch:{ JSONException -> 0x00c8 }
            java.lang.String r3 = "individualAllocation"
            r1 = 32768(0x8000, float:4.5918E-41)
            boolean r0 = r5.has(r3)     // Catch:{ JSONException -> 0x00c6 }
            if (r0 == 0) goto L_0x00c6
            int r1 = r5.getInt(r3)     // Catch:{ JSONException -> 0x00c6 }
        L_0x00c6:
            r2.A01 = r1     // Catch:{ JSONException -> 0x00c8 }
        L_0x00c8:
            X.1VX r1 = r6.$abProps
            r0 = 5991(0x1767, float:8.395E-42)
            boolean r0 = r1.A0X(r0)
            r0 = r0 ^ 1
            r2.A0m = r0
            X.1VX r1 = r6.$abProps
            r0 = 6015(0x177f, float:8.429E-42)
            boolean r0 = r1.A0X(r0)
            r4 = r4 ^ r0
            r2.A0i = r4
            X.1VX r1 = r6.$abProps
            r0 = 5440(0x1540, float:7.623E-42)
            boolean r0 = r1.A0X(r0)
            r2.A0k = r0
            X.1VX r1 = r6.$abProps
            r0 = 6180(0x1824, float:8.66E-42)
            boolean r0 = r1.A0X(r0)
            r2.A0g = r0
            X.1VX r1 = r6.$abProps
            r0 = 6343(0x18c7, float:8.888E-42)
            int r0 = r1.A0N(r0)
            r2.A07 = r0
            X.1VX r1 = r6.$abProps
            r0 = 6392(0x18f8, float:8.957E-42)
            boolean r0 = r1.A0X(r0)
            r2.A0l = r0
            X.1VX r1 = r6.$abProps
            r0 = 6401(0x1901, float:8.97E-42)
            int r0 = r1.A0N(r0)
            r2.A0A = r0
            X.1VX r1 = r6.$abProps
            r0 = 6357(0x18d5, float:8.908E-42)
            boolean r0 = r1.A0X(r0)
            r2.A0d = r0
            X.1VX r1 = r6.$abProps
            r0 = 6549(0x1995, float:9.177E-42)
            boolean r0 = r1.A0X(r0)
            r2.A0o = r0
            X.1VX r1 = r6.$abProps
            r0 = 6596(0x19c4, float:9.243E-42)
            int r0 = r1.A0N(r0)
            r2.A09 = r0
            X.1VX r1 = r6.$abProps
            r0 = 6597(0x19c5, float:9.244E-42)
            int r0 = r1.A0N(r0)
            r2.A0E = r0
            X.8LG r0 = new X.8LG
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8WM.invoke():java.lang.Object");
    }
}
