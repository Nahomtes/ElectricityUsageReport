# ElectricityUsageReport
An electricity supply authority records on an electricity usage file the amount of electricity that each customer uses.

This file consists of:

a header record (first record), which provides the total kilowatt hours used during the month by all customers
a number of detail records, each containing the customer number, customer name and electricity usage (in kilowatt hours) for the month.
Design a solution algorithm that will read the electricity usage file and produce an electricity usage report showing the customer number, customer name, electricity usage and the amount owing. The amount owing is calculated at 11 cents for each kilowatt hour used, up to 200 hours, and 8 cents for each kilowatt hour used over 200 hours.

The report should also display the total electricity usage in kilowatt hours.

pseudocode:

    BEGIN:
        Open record file
        Read first record
        GET totalUsage
        
        Read detail records
        GET customerNumber
        GET customerName
        GET electricityUsage
        
        Set over200HoursBill = 0.0
        
        IF eletricityUsage > 200 THEN
            over200Hours = electricityUsage - 200
            over200HoursBill = over200Hours * 8
        ENDIF
         
        eletricityBill = (200 * 8) + over200HoursBill
        
        Display: "customerName with customerNumber customer number has used electricityUsage. Total eletricity bill: eletricityBill"
    END