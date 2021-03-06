package com.google.android.gms.people.internal.autocomplete;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl implements Creator<ParcelableLoadAutocompleteResultsOptions> {
    static void zza(ParcelableLoadAutocompleteResultsOptions parcelableLoadAutocompleteResultsOptions, Parcel parcel, int i) {
        int zzbe = zzb.zzbe(parcel);
        zzb.zzc(parcel, 1, parcelableLoadAutocompleteResultsOptions.mVersionCode);
        zzb.zzc(parcel, 2, parcelableLoadAutocompleteResultsOptions.zzasY);
        zzb.zza(parcel, 3, parcelableLoadAutocompleteResultsOptions.zzbHM);
        zzb.zza(parcel, 4, parcelableLoadAutocompleteResultsOptions.zzPe, false);
        zzb.zzJ(parcel, zzbe);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzjE(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zznI(i);
    }

    public ParcelableLoadAutocompleteResultsOptions zzjE(Parcel parcel) {
        int i = 0;
        int zzbd = zza.zzbd(parcel);
        long j = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzbd) {
            int zzbc = zza.zzbc(parcel);
            switch (zza.zzdr(zzbc)) {
                case 1:
                    i2 = zza.zzg(parcel, zzbc);
                    break;
                case 2:
                    i = zza.zzg(parcel, zzbc);
                    break;
                case 3:
                    j = zza.zzi(parcel, zzbc);
                    break;
                case 4:
                    str = zza.zzq(parcel, zzbc);
                    break;
                default:
                    zza.zzb(parcel, zzbc);
                    break;
            }
        }
        if (parcel.dataPosition() == zzbd) {
            return new ParcelableLoadAutocompleteResultsOptions(i2, i, j, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzbd, parcel);
    }

    public ParcelableLoadAutocompleteResultsOptions[] zznI(int i) {
        return new ParcelableLoadAutocompleteResultsOptions[i];
    }
}
