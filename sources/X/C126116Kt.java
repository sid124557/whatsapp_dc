package X;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

/* renamed from: X.6Kt  reason: invalid class name and case insensitive filesystem */
public class C126116Kt extends C157817iv {
    public final NetworkStats.Bucket A00 = new NetworkStats.Bucket();
    public final NetworkStatsManager A01;

    public boolean A01() {
        return true;
    }

    public boolean A02(long[] jArr) {
        try {
            Arrays.fill(jArr, 0);
            A03(jArr, 0, 2);
            A03(jArr, 1, 0);
            return true;
        } catch (RemoteException | IllegalArgumentException | NullPointerException e) {
            Log.e("NetworkStatsManagerBytesCollector", "Unable to get bytes transferred", e);
            return false;
        }
    }

    public final void A03(long[] jArr, int i, int i2) {
        try {
            NetworkStats querySummary = this.A01.querySummary(i, (String) null, Long.MIN_VALUE, Long.MAX_VALUE);
            while (querySummary.hasNextBucket()) {
                NetworkStats.Bucket bucket = this.A00;
                querySummary.getNextBucket(bucket);
                int i3 = 4;
                if (bucket.getState() == 2) {
                    i3 = 0;
                }
                int i4 = i2 | i3;
                jArr[i4] = jArr[i4] + bucket.getRxBytes();
                int i5 = i3 | i2 | 1;
                jArr[i5] = jArr[i5] + bucket.getTxBytes();
            }
            querySummary.close();
        } catch (IllegalStateException | SecurityException e) {
            Log.e("NetworkStatsManagerBytesCollector", "NetworkStatsManager throws exception: ", e);
        }
    }

    public C126116Kt(Context context) {
        this.A01 = (NetworkStatsManager) context.getSystemService(NetworkStatsManager.class);
    }
}
