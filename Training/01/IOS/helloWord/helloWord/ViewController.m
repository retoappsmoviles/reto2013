//
//  ViewController.m
//  helloWord
//
//  Created by carlos on 24/09/13.
//  Copyright (c) 2013 carlos. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (IBAction)pushMe:(id)sender {
    self.label.text = @"Hello Word!";
}
@end
